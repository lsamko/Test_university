package uni;

import javax.naming.Name;
import java.util.List;

public class University {
    String name;
    List<Faculty> faculties;

    public University(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", Faculty='" + faculties + '\'' +
                '}';
    }
}
