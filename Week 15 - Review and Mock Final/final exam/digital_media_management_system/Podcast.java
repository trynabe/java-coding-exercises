public class Podcast implements Media, Playable {
    String title;
    int duration;
    String host;
    String topic;

    public Podcast(String title, int duration, String host, String topic) {
        this.title = title;
        this.duration = duration;
        this.host = host;
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void play() {
        System.out.println("Now playing: " + title + " by " + host);
    }
}