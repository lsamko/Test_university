package uni;

import java.util.List;

public class ControllerFaculty {
    private Faculty model2;
    private FacultyView view2;

    public ControllerFaculty(Faculty model2, FacultyView view2) {
        this.model2 = model2;
        this.view2 = view2;
    }

    public String getName() {
        return model2.getName();
    }

    public List<Group> getGroup() {
        return model2.getGroup();
    }


    public void updateGroupsView() {
        view2.printFacultyDetails(model2.getName(), model2.getGroup());
    }
}

