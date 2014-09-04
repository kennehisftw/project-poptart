package me.poptart;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import me.poptart.ui.UIManager;
import me.poptart.ui.presenter.MainPresenter;
import me.poptart.ui.view.buttons.ControlButton;

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

        for(Component comp : presenter.view().controlPanel().getComponents()) {
            if(comp instanceof ControlButton) {
                ((ControlButton) comp).addActionListener(e -> System.out.println(e.getSource()));
            }
        }

        presenter.view().controlPanel().play().addActionListener(e ->
                JOptionPane.showConfirmDialog(presenter.view().frame(), "YAY", "You clicked the play button!", JOptionPane.DEFAULT_OPTION));
    }

}
