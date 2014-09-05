package me.poptart.utils;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class Internet {

    public static Connection connect(String url) {
        return Jsoup.connect(url);
    }

    public static Document document(String url) {
        Connection conn = connect(url);
        try {
            return conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Image image(String url) {
        try {
            return ImageIO.read(new URL(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String text(String url) {
        StringBuilder builder = new StringBuilder();
        URLConnection conn = null;
        try {
            conn = new URL(url).openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String input;
        try {
            while((input = reader.readLine()) != null) {
                builder.append(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

}
