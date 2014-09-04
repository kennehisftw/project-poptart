package me.poptart.ui.view;

import me.poptart.ui.model.MainModel;
import me.poptart.ui.presenter.MainPresenter;
import me.poptart.ui.view.menus.PoptartMenuBar;
import me.poptart.ui.view.panels.ControlPanel;

import javax.swing.*;
import java.awt.*;


/**
 * @author : const_
 */
public class MainView extends View<MainPresenter, MainModel> {

    private JFrame frame;
    private ControlPanel controlPanel;

    public MainView(MainPresenter presenter) {
        super(presenter);
    }

    @Override
    public void init() {
        frame = new JFrame("Project Poptart");
        frame.setSize(new Dimension(800, 600));
        frame.getContentPane().setLayout(new BorderLayout());

        frame.getContentPane().setBackground(Color.BLACK);

        controlPanel = new ControlPanel();
        frame.getContentPane().add(controlPanel, BorderLayout.SOUTH);

        PoptartMenuBar bar = new PoptartMenuBar();
        frame.setJMenuBar(bar);
    }

    public ControlPanel controlPanel() {
        return controlPanel;
    }

    public JFrame frame() {
        return frame;
    }
}
