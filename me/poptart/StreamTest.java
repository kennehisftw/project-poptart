package me.poptart;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class StreamTest extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Media media = new Media("http://r8---sn-5uaeznl7.googlevideo.com/videoplayback?nh=IgpwcjAyLmF0bDAxKgw3Mi4xNC4yMjEuODE&gcr=us&itag=22&id=o-ADCx9H07Q0gOf5t_mhLqzQSrLFO6pjlTWGsI4YzEAY5I&ms=au&mt=1409872240&fexp=914048%2C917000%2C927606%2C927622%2C931983%2C932404%2C932623%2C932625%2C934024%2C934030%2C934804%2C942462%2C946023%2C953801&sparams=gcr%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Cmm%2Cms%2Cmv%2Cnh%2Cratebypass%2Csource%2Cupn%2Cexpire&sver=3&expire=1409893892&key=yt5&ip=97.97.52.93&initcwndbps=1210000&mv=m&upn=npoJj2HhA2g&mm=31&source=youtube&ratebypass=yes&ipbits=0&signature=AAD4E5A5CB358FC6CF57D2730B3D2FB94D84A35F.91AACEA4597B988AFB01B04F9E6A667E2FF1AE4B&title=Mr.%20Probz%20-%20Waves%20%28Robin%20Schulz%20Remix%20Radio%20Edit%29");
        MediaPlayer player = new MediaPlayer(media);
        MediaView view = new MediaView(player);

        BorderPane pane = new BorderPane();
        pane.setCenter(view);

        primaryStage.setScene(new Scene(pane, 500, 300));
        primaryStage.show();
        player.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
