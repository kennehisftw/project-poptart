package me.poptart.ui.view.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class ControlButton extends JButton {

    public ControlButton(Image image) {
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setIcon(new ImageIcon(image));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                setCursor(Cursor.getDefaultCursor());
            }
        });
    }

}
