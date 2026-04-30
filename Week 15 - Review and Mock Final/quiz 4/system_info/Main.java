package system_info;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("Alice", 78));
        manager.addStudent(new Student("Bob", 82));
        manager.addStudent(new Student("Charlie", 91));

        manager.saveToFile("students.txt");
    }
}
