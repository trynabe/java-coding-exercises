public class Song implements Media, Playable {
    String title;
    int duration;
    String artist;
    String genre;

    public Song(String title, int duration, String artist, String genre) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void play() {
        System.out.println("Now playing: " + title + " by " + artist);
    }
}
