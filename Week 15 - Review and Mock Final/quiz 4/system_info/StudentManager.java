package system_info;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> student = new ArrayList<>();

    void addStudent(Student s) {
        student.add(s);
    }

    void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Student s : student) {
                writer.write("Name: " + s.getName() + ", Score: " + s.getScore());
                writer.newLine();
            }
            System.out.println("Data saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
