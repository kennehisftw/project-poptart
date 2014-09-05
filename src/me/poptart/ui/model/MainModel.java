package me.poptart.ui.model;


import javafx.scene.media.MediaPlayer;
import me.poptart.ui.presenter.MainPresenter;
import me.poptart.ui.view.MainView;
import me.poptart.ui.view.buttons.ControlButton;
import me.poptart.ui.view.panels.MediaPanel;
import me.poptart.utils.Images;
import me.poptart.utils.Utilities;

import javax.swing.*;

/**
 * @author : const_
 */
public class MainModel extends Model<MainPresenter, MainView> {

    public MainModel(MainPresenter presenter) {
        super(presenter);
    }
}
