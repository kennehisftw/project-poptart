package me.poptart.ui.view.menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class ToolMenu extends JMenu implements ActionListener {

    private JMenuItem disco, search;


    public ToolMenu() {
        setText("Tools");
        search = new JMenuItem("Search");
        disco = new JMenuItem("Disco mode");

        add(disco); add(search);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
