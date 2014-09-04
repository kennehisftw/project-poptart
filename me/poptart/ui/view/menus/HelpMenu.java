package me.poptart.ui.view.menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class HelpMenu extends JMenu implements ActionListener {

    private JMenuItem about;

    public HelpMenu() {
        setText("Help");
        about = new JMenuItem("About");

        add(about);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
