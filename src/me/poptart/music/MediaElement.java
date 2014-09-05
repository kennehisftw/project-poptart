package me.poptart.music;

/**
 * Created by Kenneth on 9/4/2014.
 */
public class MediaElement {

    private String url;
    private MetaData meta;

    public MediaElement(String url, MetaData meta) {
        this.url = url;
        this.meta = meta;
    }

    public String url() {
        return url;
    }

    public MetaData meta() {
        return meta;
    }

    public class MetaData {
        private String title, artist, time, date, user, album;

        public MetaData(String title, String artist, String time, String date, String user, String album) {
            this.title = title;
            this.artist = artist;
            this.time = time;
            this.date = date;
            this.user = user;
            this.album = album;
        }

        public String title() {
            return title;
        }

        public String artist() {
            return artist;
        }

        public String time() {
            return time;
        }

        public String date() {
            return date;
        }

        public String user() {
            return user;
        }

        public String album() {
            return album;
        }
    }

}

