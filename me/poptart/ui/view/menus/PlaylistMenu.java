package me.poptart.ui.view.menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class PlaylistMenu extends JMenu implements ActionListener {

    private JMenuItem buildPlaylist, importPlaylist, addToCurrent;

    public PlaylistMenu() {
        setText("Playlist");

        buildPlaylist = new JMenuItem("Build a playlist");
        importPlaylist = new JMenuItem("Import a playlist");
        addToCurrent = new JMenuItem("Add to current playlist");

        add(buildPlaylist); add(importPlaylist); add(addToCurrent);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
    }
}
