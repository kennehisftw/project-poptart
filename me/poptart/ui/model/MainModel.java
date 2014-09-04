package me.poptart.ui.model;


import me.poptart.ui.presenter.MainPresenter;
import me.poptart.ui.view.MainView;

/**
 * @author : const_
 */
public class MainModel extends Model<MainPresenter, MainView> {

    public MainModel(MainPresenter presenter) {
        super(presenter);
    }
}
