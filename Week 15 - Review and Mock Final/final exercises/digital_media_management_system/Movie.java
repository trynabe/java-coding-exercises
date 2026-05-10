public class Movie implements Media, Playable {
    String title;
    int duration;
    String director;
    double rating;

    public Movie(String title, int duration, String director, double rating) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void play() {
        System.out.println("Now playing: " + title + " by " + director);
    }
}