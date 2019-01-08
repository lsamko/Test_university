package uni;

import java.util.List;

public class Faculty {
    String name;
    List<Group> groups;
    List<Student> students;


    public Faculty(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;

    }

    public String getName() {
        return name;
    }

    public List<Group> getGroup() {
        return groups;
    }


    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", Group='" + groups + '\'' +
                '}';
    }
}
