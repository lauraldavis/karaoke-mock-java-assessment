import java.util.List;

public class Album {

    private String name;
    private List<Song> songs;

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public List<Song> getSongs() {return songs; }
    public void setSongs(List<Song> songs) {this.songs = songs;}

    public void printTrackListings() {
        System.out.println(this.name + " track listing...");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + this.songs.get(i).getTitle() + " by " + this.songs.get(i).getArtist());
        }
    }

}
