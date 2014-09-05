package me.poptart.ui.view.panels;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class TablePanel extends JPanel {

    private final Color background = new Color(18, 19, 21);
    private String[] headers = {"Title", "Artist", "Time", "Date added", "User", "Album"};

    private JScrollPane scrollPane;
    private JTable table;
    private DefaultTableModel model;

    public TablePanel() {
        setBackground(background);
        setLayout(new BorderLayout());

        model = new DefaultTableModel(null, headers);

        table = new JTable(model);
        table.setBackground(background);
        table.setForeground(Color.WHITE);

        JTableHeader header = table.getTableHeader();
        header.setOpaque(false);
        header.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        header.setBackground(new Color(6, 10, 20));
        header.setForeground(Color.WHITE);

        scrollPane = new JScrollPane(table);

        model.addRow(new String[] {"Break Free", "Ariana Grande", "3:47", "9/4/2014", "Kenneh", "My Everything"});
        add(scrollPane, BorderLayout.CENTER);
    }

}
