package me.poptart.utils;

import me.poptart.Application;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class Images {

    private static Map<String, Image> IMAGE_MAP = new HashMap<>();

    private static String[][] images = {
            {"play", "Actions-media-playback-start-icon.png"},
            {"volume-low", "Status-audio-volume-low-icon.png"},
            {"volume-medium", "Status-audio-volume-medium-icon.png"},
            {"volume-high", "Status-audio-volume-high-icon.png"},
            {"volume-mute", "Status-audio-volume-muted-icon.png"},
            {"pause", "Actions-media-playback-pause-icon.png"},
            {"poptart", "poptart.png"}

    };

    static {
        for(int i = 0; i < images.length; i++) {
            IMAGE_MAP.put(images[i][0], load(images[i][1]));
        }
    }

    public static Image get(String name) {
        return IMAGE_MAP.get(name);
    }

    private static Image load(String name) {
        try {
            System.out.println(Application.class.getResource("/resources/" + name));
            return ImageIO.read(Images.class.getResourceAsStream("/resources/" +name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
