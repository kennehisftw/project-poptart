package me.poptart;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import javafx.scene.media.MediaPlayer;
import me.poptart.ui.UIManager;
import me.poptart.ui.presenter.MainPresenter;
import me.poptart.ui.view.buttons.ControlButton;
import me.poptart.ui.view.panels.MediaPanel;
import me.poptart.utils.Images;
import me.poptart.utils.Utilities;

import javax.swing.*;
import java.text.ParseException;


/**
 * @author : const_
 */
public class Application {

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        } catch (UnsupportedLookAndFeelException | ParseException e) {
            e.printStackTrace();
        }

        MainPresenter presenter = UIManager.get(MainPresenter.class);
        presenter.show();

        MediaPanel media = new MediaPanel();

        ControlButton play = presenter.view().controlPanel().play();
        play.addActionListener(listener -> {
            System.out.println(media.player().getStatus());
            if(media.player().getStatus() == MediaPlayer.Status.PAUSED) {
                media.player().play();
                play.setIcon(new ImageIcon(Images.get("pause")));
            } else if(media.player().getStatus() == MediaPlayer.Status.PLAYING) {
                media.player().pause();
                play.setIcon(new ImageIcon(Images.get("play")));
            } else if(media.player().getStatus() == MediaPlayer.Status.STOPPED || media.player().getStatus() == MediaPlayer.Status.READY) {
                media.load("https://www.youtube.com/watch?v=gO4lEMyw1bw");
                media.player().play();
                media.player().currentTimeProperty().addListener((observableValue, duration, current) -> {
                    final long currentTime = (long) current.toMillis();
                    final long totalDuration = (long) media.player().getMedia().getDuration().toMillis();
                    final int percentage = (int) (((currentTime * 100.0) / totalDuration) + 0.5);
                    presenter.view().controlPanel().seek().setValue(percentage);
                    presenter.view().controlPanel().current().setText(Utilities.formatTime(currentTime));
                    presenter.view().controlPanel().total().setText(Utilities.formatTime(totalDuration));
                });
                play.setIcon(new ImageIcon(Images.get("pause")));
            }
        });

        presenter.view().controlPanel().volume().addChangeListener(listener -> {
            double volume = presenter.view().controlPanel().volume().getValue() / 100D;
            media.player().setVolume(volume);
            ControlButton button = presenter.view().controlPanel().mute();
            if (volume >= .66) {
                button.setIcon(new ImageIcon(Images.get("volume-high")));
            } else if (volume >= .33) {
                button.setIcon(new ImageIcon(Images.get("volume-medium")));
            } else if (volume >= .01) {
                button.setIcon(new ImageIcon(Images.get("volume-low")));
            } else {
                button.setIcon(new ImageIcon(Images.get("volume-mute")));
            }
        });

    }

}
