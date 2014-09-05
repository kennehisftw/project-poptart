package me.poptart.ui.presenter;

import me.poptart.ui.model.MainModel;
import me.poptart.ui.view.MainView;

/**
 * @author : const_
 */
public class MainPresenter extends Presenter<MainView, MainModel> {

    @Override
    public void link() {
        MainView view = new MainView(this);
        MainModel model = new MainModel(this);
        set(view, model);
        view.link();
        model.link();
    }

    @Override
    public void show() {
        view().frame().setVisible(true);
    }

    @Override
    public void hide() {

    }
}
