package me.poptart.ui.model;


import me.poptart.ui.presenter.Presenter;
import me.poptart.ui.view.View;

/**
 * @author : const_
 * Used to store all the data of the ui
 */
public abstract class Model<P extends Presenter, V extends View> {

    private P presenter;
    private V view;

    public Model(P presenter) {
        this.presenter = presenter;
    }

    @SuppressWarnings("unchecked")
    public void link() {
        view = (V) presenter.view();
    }

    public P presenter() {
        return presenter;
    }

    private V view() {
        return view;
    }
}
