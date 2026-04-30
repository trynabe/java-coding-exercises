public class ZumbaClass implements Schedule {
    String day;
    String time;
    String instructor;

    public ZumbaClass(String day, String time, String instructor) {
        this.day = day;
        this.time = time;
        this.instructor = instructor;
    }

    public String getTime() {
        return time;
    }

    public String getDay() {
        return day;
    }

    public String toString() {
        return day + " at " + time + " (Zumba Class)";
    }
}
