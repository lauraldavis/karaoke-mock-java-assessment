import java.util.Arrays;
import java.util.List;

public class Song {

    private String title;
    private String artist;
    private List<String> lyrics;

    public Song() {
    }

    public Song(String title, String artist, List<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getArtist() {return artist;}
    public void setArtist(String artist) {this.artist = artist;}

    public List<String> getLyrics() {return lyrics;}
    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }

    // take in a single string input of several words
    // return a list of strings - the output of splitting the input string on a single space character " "
    public static List<String> parseLyrics(String input) {
        return  Arrays.asList(input.split(" "));
    }

}




