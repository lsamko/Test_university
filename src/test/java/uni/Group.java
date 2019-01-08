package uni;

import java.util.List;

public class Group {
    String group;
    int num;
    List<Student> students;
    public Group(String group, int num, List<Student> students) {
        this.group = group;
        this.num = num;
        this.students =students;

    }

    public String getGroup() {
        return group;
    }

    public int getNum() {
        return num;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group='" + group + '\'' +
                ", gr=" + num +
                ", students=" + students +
                '}';
    }
}





