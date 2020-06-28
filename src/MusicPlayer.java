import java.util.List;

import static java.lang.Thread.sleep;

public class MusicPlayer extends Player {

    private String voice = "";

    public MusicPlayer() {}

    public MusicPlayer(String voice) {
        this.voice = voice;
    }

    public String getVoice() { return voice; }
    public void setVoice(String voice) { this.voice = voice; }

    @Override
    public void play(Album album) {
        for (Song song : album.getSongs()) {
            play(song);
        }
    }

    @Override
    public void play(Song song) {
        Runtime r = Runtime.getRuntime(); // execute terminal commands
        try {
            r.exec("say Now playing..." + song.getTitle() + " by " + song.getArtist());
            sleep(INTRO_PAUSE);
            for (String lyric : song.getLyrics()) {
                if (getVoice().isEmpty()) {
                    r.exec("say " + lyric);
                } else {
                    r.exec("say -v " + getVoice() + " " + lyric);
                }
                sleep(WORD_CADENCE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
