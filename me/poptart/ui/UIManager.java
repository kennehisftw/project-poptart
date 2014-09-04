package me.poptart.ui;

import me.poptart.ui.presenter.MainPresenter;
import me.poptart.ui.presenter.Presenter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : const_
 */
public class UIManager {

    private static List<Presenter> PRESENTERS = new LinkedList<>();

    static {
        PRESENTERS.add(new MainPresenter());
    }

    @SuppressWarnings("unchecked")
    public static <T> T get(Class<T> clazz) {
        for(Presenter presenter : PRESENTERS) {
            if(presenter.getClass().equals(clazz)) {
                return (T) presenter;
            }
        }
        return null;
    }
}
