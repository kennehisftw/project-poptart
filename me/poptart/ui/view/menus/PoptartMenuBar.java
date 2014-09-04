package me.poptart.ui.view.menus;

import javax.swing.*;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class PoptartMenuBar extends JMenuBar {

    public PoptartMenuBar() {
        add(new FileMenu());
        add(new PlaylistMenu());
        add(new ToolMenu());
        add(new HelpMenu());
    }
}
