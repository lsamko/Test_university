package uni;

import java.util.List;

public class StudentView {
    public void printStudentDetails(String firstName, String lastName, int age, List<Integer> mark) {
        System.out.println("Student: ");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
    }
}

