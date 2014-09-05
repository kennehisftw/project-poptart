package me.poptart.ui.view.panels;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import me.poptart.grabbers.YouTube;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class MediaPanel extends JFXPanel {

    private MediaPlayer player;

    public MediaPanel() {
        load("https://www.youtube.com/watch?v=ogMNV33AhCY");
    }

    public MediaPlayer player() {
        return player;
    }

    public void load(String url) {
        load(new Media(YouTube.getStreamURL(url)));
    }

    public void load(Media media) {
        player = new MediaPlayer(media);
    }

}
