package me.poptart.ui.view.panels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class DurationPanel extends JPanel {

    public String current, maximum;
    public JSlider seek;

    private JLabel currentTime, maximumTime;

    public DurationPanel() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        current = "0:00"; maximum = "3:47";
        currentTime = new JLabel(current);
        currentTime.setForeground(Color.WHITE);
        maximumTime = new JLabel(maximum);
        maximumTime.setForeground(Color.WHITE);

        seek = new JSlider();
        seek.setPreferredSize(new Dimension(250, 25));
        setOpaque(false);
        add(currentTime); add(Box.createRigidArea(new Dimension(3, 0)));
        add(seek); add(Box.createRigidArea(new Dimension(3, 0)));
        add(maximumTime); add(Box.createRigidArea(new Dimension(5, 0)));
    }

    public String current() {
        return current;
    }

    public String maximum() {
        return maximum;
    }

    public JSlider seek() {
        return seek;
    }

}
