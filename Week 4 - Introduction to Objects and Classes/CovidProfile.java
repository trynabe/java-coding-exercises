public class CovidProfile {
    private String date;
    private String location;
    private int accumulatedCases;
    private int curedCases;
    private int deathCases;

    public CovidProfile(String _date, String loc, int noACC, int noCured, int noDeath) {
        this.date = _date;
        this.location = loc;
        this.accumulatedCases = noACC;
        this.curedCases = noCured;
        this.deathCases = noDeath;
    }

    public String getLocation() {
        return this.location;
    }

    public int getAccCases() {
        return this.accumulatedCases;
    }

    public int getCuredCases() {
        return this.curedCases;
    }

    public int getDeathCases() {
        return this.deathCases;
    }

    public void setLocation(String loc) {
        this.location = loc;
    }

    public void setAccCases(int value) {
        this.accumulatedCases = value;
    }

    public void setCuredCases(int value) {
        this.curedCases = value;
    }

    public void setDeathCases(int value) {
        this.deathCases = value;
    }

    public void printCovidInfo() {
        System.out.println("Date: " + this.date);
        System.out.println("Location: " + this.location);
        System.out.println("Accumulated Cases: " + this.accumulatedCases);
        System.out.println("Cured Cases: " + this.curedCases);
        System.out.println("Death Cases: " + this.deathCases);
        System.out.println("--------------------------------");
    }
}
