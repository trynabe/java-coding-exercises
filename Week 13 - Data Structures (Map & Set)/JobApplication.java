import java.util.*;
import java.util.Map.Entry;

public class JobApplication {
    private static Set<String> skills = new HashSet<String>(Arrays.asList("Java","HTML5","CSS3"));
    private static Map<String, Set<String>> applicants = new HashMap<String, Set<String>>();

    public static void main(String[] args) {
        //------Task1------//
        System.out.println("Task 1: create and show applicants");
        createApplicants();
        //------Task2------//
        System.out.println("Task 2: findApplicantsWithMatchSkills");
        findApplicantsWithMatchSkills();
        //------Task3------//
        System.out.println("Task 3: allApplicantsSkills");
        allApplicantsSkills();
        //------Challenge------//
        System.out.println("Challenge: findApplicantsBySkill");
        findApplicantsBySkill("Java");
    }

    public static void createApplicants() {
        applicants.put("Peter", new HashSet<>(Arrays.asList("C++", "Ruby")));
        applicants.put("Aum",   new HashSet<>(Arrays.asList("C#", "Java")));
        applicants.put("Tip",   new HashSet<>(Arrays.asList("Java", "CSS3", "HTML5")));
        applicants.put("Jane",  new HashSet<>(Arrays.asList("HTML5", "Ruby", "Java", "CSS3")));

        for (Entry<String, Set<String>> entry : applicants.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void findApplicantsWithMatchSkills() {
        for (Entry<String, Set<String>> entry : applicants.entrySet()) {
            if (entry.getValue().containsAll(skills)) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
    }

    public static void allApplicantsSkills() {
        Set<String> allSkills = new HashSet<>();
        for (Set<String> s : applicants.values()) {
            allSkills.addAll(s);
        }
        System.out.println("all applicants' skills " + allSkills);
    }

    public static void findApplicantsBySkill(String skill) {
        boolean found = false;
        for (Entry<String, Set<String>> entry : applicants.entrySet()) {
            if (entry.getValue().contains(skill)) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No applicants found with skill: " + skill);
        }
    }
}