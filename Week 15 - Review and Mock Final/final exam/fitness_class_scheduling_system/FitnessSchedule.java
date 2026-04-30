import java.util.*;

public class FitnessSchedule {
    Set<Schedule> classes = new HashSet<>();
    Map<Member, Set<Schedule>> memberSchedule = new HashMap<>();

    public void addClass(Schedule schedule) {
        classes.add(schedule);
    }

    public void enrollMember(Member member, Schedule schedule) {
        memberSchedule.putIfAbsent(member, new HashSet<>());
        memberSchedule.get(member).add(schedule);
        System.out.println(member.name + " enrolled in " + schedule.getClass().getSimpleName());
    }

    public void viewMemberSchedule(Member member) {
        System.out.println(" " + member.name + "'s Schedule:");
        Set<Schedule> schedules = memberSchedule.get(member);
        if (schedules != null) {
            for (Schedule s : schedules) {
                System.out.println(s.toString());
            }
        }
    }

    public void viewClassParticipants(Schedule schedule) {
        System.out.println("Participants in " + schedule.getClass().getSimpleName() + ":");
        for (Member m : memberSchedule.keySet()) {
            if (memberSchedule.get(m).contains(schedule)) {
                System.out.println(m.name);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating Classes:");

        YogaClass yoga = new YogaClass("Monday", "9:00 AM", "Alice");
        ZumbaClass zumba = new ZumbaClass("Tuesday", "6:00 PM", "Bob");
        BoxingClass boxing = new BoxingClass("Wednesday", "7:00 PM", "Cindy");

        System.out.println("Yoga Class: Monday at 9:00 AM with Instructor: Alice");
        System.out.println("Zumba Class: Tuesday at 6:00 PM with Instructor: Bob");
        System.out.println("Boxing Class: Wednesday at 7:00 PM with Instructor: Cindy");

        System.out.println("Creating Members:");

        Member john = new Member("John", "123");
        Member jane = new Member("Jane", "456");

        System.out.println("Member: Name=John, ID=123");
        System.out.println("Member: Name=Jane, ID=456");

        FitnessSchedule fs = new FitnessSchedule();

        fs.addClass(yoga);
        fs.addClass(zumba);
        fs.addClass(boxing);

        System.out.println("Enrolling Members:");

        fs.enrollMember(john, yoga);
        fs.enrollMember(jane, zumba);
        fs.enrollMember(john, boxing);

        fs.viewClassParticipants(yoga);
        fs.viewClassParticipants(zumba);
        fs.viewClassParticipants(boxing);
    }
}
