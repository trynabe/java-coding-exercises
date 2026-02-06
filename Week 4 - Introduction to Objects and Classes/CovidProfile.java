// Task 1
public class CovidProfile {
    public static int countProfile = 0;

    private String date;
    private String location;
    private int accumulatedCases;
    private int curedCases;
    private int deathCases;

    public CovidProfile(){
        date = "none";
        location = "none";
        accumulatedCases = 0;
        curedCases = 0;
        deathCases = 0;
        countProfile += 1;
    }

    public CovidProfile(String _date, String loc, int noAcc, int noCured, int noDeath){
        date = _date;
        location = loc;
        accumulatedCases = noAcc;
        curedCases = noCured;
        deathCases = noDeath;
        countProfile += 1;
    }

    public String getLocation(){
        return location;
    }
    public int getAccCases(){
        return accumulatedCases;
    }
    public int getCuredCases(){
        return curedCases;
    }
    public int getDeathCases(){
        return deathCases;
    }

    public void setLocation(String loc){
        location = loc;
    }
    public void setAccCases(int acc){
        accumulatedCases = acc;
    }
    public void setCuredCases(int cured){
        curedCases = cured;
    }
    public void setDeathCases(int death){
        deathCases = death;
    }

// Task 4
    public void printCovidInfo(){
        System.out.println(location + " at " + date);
        System.out.println("Accumulative Patient: " + accumulatedCases);
        System.out.println("Cured Patient: " + curedCases);
        System.out.println("Death Case: " + deathCases);
    }
// Challenge Bonus
    public boolean isSevere(){
        if (deathCases > 10000){
            return true;
        } else {
            return false;
        }
    }
}

