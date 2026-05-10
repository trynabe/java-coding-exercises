import java.util.*;

public class Playlist {
    List<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public int getTotalDuration() {
        int total = 0;
        for (Media m : mediaList) {
            total += m.getDuration();
        }
        return total;
    }

    public void playAll() {
        for (Media m : mediaList) {
            ((Playable) m).play();
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating Media...");

        Song song = new Song("Bohemian Rhapsody", 355, "Queen", "Rock");
        Movie movie = new Movie("Inception", 148, "Christopher Nolan", 8.8);
        Podcast podcast = new Podcast("The Daily", 20, "Michael Barbaro", "News");

        System.out.println("Song: Title=" + song.title + ", Artist=" + song.artist + ", Genre=" + song.genre + ", Duration=" + song.duration + " minutes");
        System.out.println("Movie: Title=" + movie.title + ", Director=" + movie.director + ", Rating=" + movie.rating + ", Duration=" + movie.duration + " minutes");
        System.out.println("Podcast: Title=" + podcast.title + ", Host=" + podcast.host + ", Topic=" + podcast.topic + ", Duration=" + podcast.duration + " minutes");

        Playlist playlist = new Playlist();

        System.out.println("\nAdding Media to Playlist...");

        playlist.addMedia(song);
        playlist.addMedia(movie);
        playlist.addMedia(podcast);

        System.out.println("Total Playlist Duration: " + playlist.getTotalDuration() + " minutes");

        System.out.println("\nPlaying Playlist:");
        playlist.playAll();
    }
}
