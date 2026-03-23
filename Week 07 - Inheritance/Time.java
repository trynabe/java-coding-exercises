public class Time extends Product {
    private int startHour;
    private int endHour;
 
    public Time(String name, double price, int startHour, int endHour) {
        super(name, price);
        this.startHour = startHour;
        this.endHour = endHour;
        System.out.println("Time-restricted product is created ...");
    }
 
    public void setStartHour(int startHour) { this.startHour = startHour; }
    public void setEndHour(int endHour)     { this.endHour = endHour; }
    public int getStartHour()               { return startHour; }
    public int getEndHour()                 { return endHour; }
 
    // Returns true if the given hour is within the allowed window
    public boolean isAvailable(int hour) {
        return hour >= startHour && hour < endHour;
    }
 
    @Override
    public String toString() {
        return super.toString() + ", Available: " + startHour + ":00-" + endHour + ":00";
    }
}
