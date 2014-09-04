package me.poptart;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import me.poptart.ui.UIManager;
import me.poptart.ui.presenter.MainPresenter;
import me.poptart.ui.view.buttons.ControlButton;
import me.poptart.utils.Internet;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;


/**
 * @author : const_
 */
public class Application {

    public static void main(String[] args) {

        try {
            javax.swing.UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        } catch (UnsupportedLookAndFeelException | ParseException e) {
            e.printStackTrace();
        }

        MainPresenter presenter = UIManager.get(MainPresenter.class);
        presenter.show();

        presenter.view().frame().setIconImage(Internet.image("https://raw.githubusercontent.com/Codeusa/poptart-app/master/poptart-app/src/resources/poptart.png"));

    }

}
