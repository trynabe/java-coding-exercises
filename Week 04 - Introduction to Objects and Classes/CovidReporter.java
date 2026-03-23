public class CovidReporter {
    public static void main(String[] args) {
        CovidProfile p1 = new CovidProfile("2026-01-30", null, 0, 0, 0);
        CovidProfile p2 = new CovidProfile(null, null, 0, 0, 0);
        CovidProfile p3 = new CovidProfile(null, null, 0, 0, 0);

        p1.setLocation("THAILAND");
        p1.setAccCases(17023);
        p1.setCuredCases(11396);
        p1.setDeathCases(76);
        p3.setDeathCases(10001);
        
        System.out.println();

        p1.printCovidInfo();
        System.out.println(p1.isSevere());

        System.out.println();

        p2.printCovidInfo();
        System.out.println(p1.isSevere());

        System.out.println();

        p3.printCovidInfo();
        System.out.println(p3.isSevere());

        System.out.println();
        System.out.println("Profile Count = "+ CovidProfile.countProfile);

    }
}
