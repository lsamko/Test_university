package uni;

import java.util.List;

public class UniversityView {
    public void printUniversityDetails(String name, List<Faculty> faculties) {
        System.out.println("University: ");
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculties);
    }
}

