import java.util.Arrays;
import java.util.Scanner;

public class KaraokeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice = null;

        Player musicPlayer = new MusicPlayer("victoria"); // can change the voice
        Player lyricsPlayer = new LyricsPlayer("blue"); // can change the color

        Album a = new Album("90s Hits", Arrays.asList(
           new Song("Every Day is a Winding Road", "Sheryl Crow", Song.parseLyrics("Everyday is a winding road ... I get a little bit closer to feeling fine")),
           new Song("Ready to Go", "Republica", Song.parseLyrics("I'm standing on the rooftops shouting out, Baby, I'm ready to go")),
           new Song("Airbag", "Radiohead", Song.parseLyrics("In an interstellar burst I am back to save the universe"))
        ));

//        runKaraokeMachine(scanner, userChoice, musicPlayer, lyricsPlayer, a);

        // English voices: Alex, Fred, Samantha, Victoria
        // Other English voices are: British - Daniel, Australian - Karen, Irish - Moira, South African - Tessa, Indian - Veena

        Player myMusicPlayer = new MusicPlayer("daniel"); // can change the voice
        Player myLyricsPlayer = new LyricsPlayer("cyan"); // can change the color

        Album my = new Album("Monty Python Sings", Arrays.asList(
            new Song("Galaxy Song", "Monty Python", Song.parseLyrics("Just remember that you're standing on a planet that's evolving, revolving at 900 miles an hour")),
            new Song("Eric The Half A Bee", "Monty Python", Song.parseLyrics("Half a bee, philosophically, must ipso facto, half not be, but half the bee has got to be, vis-a-vis it's entity, you see?")),
            new Song("Finland", "Monty Python", Song.parseLyrics("Finland, Finland, Finland, the country where i want to be, pony-trekking or camping, or just watching TV"))
        ));

        runKaraokeMachine(scanner, userChoice, myMusicPlayer, myLyricsPlayer, my);
    }

    public static void runKaraokeMachine(Scanner scanner, String userChoice, Player musicPlayer, Player lyricsPlayer, Album a) {
        a.printTrackListings();

        System.out.println("\nWould you like to listen to this album (type 's') or sing karaoke with it (type 'k')? [s/k]");
        do {
            userChoice = scanner.next();
            if (!userChoice.equalsIgnoreCase("k") && !userChoice.equalsIgnoreCase("s")) {
                System.out.println("Must select either 's' or 'k'");
            }
        }
        while (!userChoice.equalsIgnoreCase("k") && !userChoice.equalsIgnoreCase("s"));

        if (userChoice.equalsIgnoreCase("k")) {
            lyricsPlayer.play(a);
        } else {
            musicPlayer.play(a);
        }

    }
}
