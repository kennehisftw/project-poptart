package me.poptart.ui.view.menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class FileMenu extends JMenu implements ActionListener {

    private JMenuItem settings, exit;

    public FileMenu() {
        setText("File");
        settings = new JMenuItem("Settings");
        exit = new JMenuItem("Exit");

        add(settings); add(exit);

        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final Object source = e.getSource();
        if(source == settings) {

        } else if(source == exit) {
            System.exit(0);
        }
        System.out.println(source);
    }
}
