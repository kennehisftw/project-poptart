package me.poptart;

import me.poptart.ui.presenter.MainPresenter;
import me.poptart.ui.view.panels.MediaPanel;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class Session {

    private static MainPresenter presenter;

    public static MainPresenter getPresenter() {
        return presenter;
    }

    public static void setPresenter(MainPresenter presenter) {
        Session.presenter = presenter;
    }

    private static MediaPanel mediaPanel;

    public static MediaPanel getMediaPanel() {
        return mediaPanel;
    }

    public static void setMediaPanel(MediaPanel mediaPanel) {
        Session.mediaPanel = mediaPanel;
    }
}
