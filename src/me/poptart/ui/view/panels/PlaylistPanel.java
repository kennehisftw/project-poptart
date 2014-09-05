package me.poptart.ui.view.panels;

import me.poptart.utils.Internet;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class PlaylistPanel extends JPanel {

    private final Color background = new Color(34, 35, 39);

    private DefaultListModel<String> playlistModel;
    private JList<String> playlists;
    private JScrollPane scrollpane;

    private JLabel albumArtLabel, songInformation;

    public PlaylistPanel() {
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        setBorder(new EtchedBorder());

        setBackground(background);
        setPreferredSize(new Dimension(200, getHeight()));

        playlistModel = new DefaultListModel<>();
        playlists = new JList<>(playlistModel);
        playlists.setBackground(background);
        playlists.setForeground(Color.WHITE);
        playlists.setBorder(new EmptyBorder(5, 5, 5, 5));

        playlistModel.addElement("The best playlist");

        scrollpane = new JScrollPane(playlists);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setPreferredSize(new Dimension(200, getHeight()));
        scrollpane.setBorder(null);

        albumArtLabel = new JLabel();
        albumArtLabel.setHorizontalAlignment(SwingConstants.LEFT);
        albumArtLabel.setBorder(null);
        setAlbumArt(Internet.image("http://upload.wikimedia.org/wikipedia/en/d/d5/Ariana_Grande_My_Everything_2014_album_artwork.png"));

        songInformation = new JLabel("<html>Break Free<br>Ariana Grande</html>");
        songInformation.setHorizontalAlignment(SwingConstants.LEFT);
        songInformation.setForeground(Color.WHITE);

        add(scrollpane);
        add(Box.createRigidArea(new Dimension(0, 5)));
        add(albumArtLabel);
        add(songInformation);

    }

    public void setAlbumArt(Image image) {
        albumArtLabel.setIcon(new ImageIcon(scale(image, 200, 200)));
    }

    private Image scale(Image image, int width, int height) {
        return image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

}
