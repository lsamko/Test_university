package uni;

import java.util.Comparator;
import java.util.List;

public class Student {
    private String firstName, lastName;
    private int age;
    List<Integer> marks;

    public Student(String firstName, String lastName, int age, List<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getMark() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mark=" + marks +
                '}';
    }


}
