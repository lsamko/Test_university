package uni;

import java.util.List;

public class ControllerGroup {
    private Group model1;
    private GroupView view1;

    public ControllerGroup(Group model1, GroupView view1) {
        this.model1 = model1;
        this.view1 = view1;
    }

    public String getGroup() {
        return model1.getGroup();
    }

    public int getNum() {
        return model1.getNum();
    }

    public List<Student> getStudents() {
        return model1.getStudents();
    }

    public void updateGroupsView() {
        view1.printGroupDetails(model1.getGroup(), model1.getNum(), model1.getStudents());
    }
}
