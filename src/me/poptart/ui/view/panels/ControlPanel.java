package me.poptart.ui.view.panels;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import me.poptart.ui.view.buttons.ControlButton;
import me.poptart.utils.Images;
import me.poptart.utils.Internet;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class ControlPanel extends JPanel {

    private final Color background = new Color(32, 33, 35);

    private ControlButton play, previous, next, mute, shuffle, repeat;
    private JSlider volume;
    private DurationPanel durationPanel;

    public ControlPanel() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBackground(background);

        play = new ControlButton(Images.get("play"));
        previous = new ControlButton(Internet.image("http://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/32/Actions-media-seek-backward-icon.png"));
        next = new ControlButton(Internet.image("http://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/32/Actions-media-seek-forward-icon.png"));
        mute = new ControlButton(Internet.image("http://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/32/Status-audio-volume-muted-icon.png"));
        shuffle = new ControlButton(Internet.image("http://icons.iconarchive.com/icons/graphicrating/koloria/32/Button-Shuffle-icon.png"));
        repeat = new ControlButton(Internet.image("http://icons.iconarchive.com/icons/fatcow/farm-fresh/32/control-repeat-icon.png"));

        volume = new JSlider();
        volume.setMaximum(100);
        volume.setPreferredSize(new Dimension(100, 25));
        volume.setMaximumSize(new Dimension(100, 25));

        add(Box.createRigidArea(new Dimension(10, 37)));
        add(previous); add(Box.createRigidArea(new Dimension(5, 0)));
        add(play); add(Box.createRigidArea(new Dimension(5, 0)));
        add(next); add(Box.createRigidArea(new Dimension(10, 0)));
        add(mute); add(Box.createRigidArea(new Dimension(5, 0)));
        add(volume); add(Box.createRigidArea(new Dimension(5, 0)));

        JSeparator separator = new JSeparator(JSeparator.VERTICAL);
        Dimension size = new Dimension(separator.getPreferredSize().width, separator.getMaximumSize().height);
        separator.setMaximumSize(size);
        add(separator); add(Box.createRigidArea(new Dimension(10, 0)));

        durationPanel = new DurationPanel();
        add(durationPanel);

        JSeparator separator1 = new JSeparator(JSeparator.VERTICAL);
        Dimension size1 = new Dimension(separator1.getPreferredSize().width, separator1.getMaximumSize().height);
        separator1.setMaximumSize(size1);
        add(separator1); add(Box.createRigidArea(new Dimension(10, 0)));

        add(shuffle); add(Box.createRigidArea(new Dimension(5, 0)));
        add(repeat); add(Box.createRigidArea(new Dimension(5, 0)));

    }

    public JLabel current() {
        return durationPanel.current();
    }

    public JLabel total() {
        return durationPanel.total();
    }

    public JSlider seek() {
        return durationPanel.seek();
    }

    public ControlButton mute() {
        return mute;
    }

    public JSlider volume() {
        return volume;
    }

    public ControlButton play() {
        return play;
    }

    public ControlButton previous() {
        return previous;
    }

    public ControlButton next() {
        return next;
    }

}
