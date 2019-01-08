package uni;

import java.util.List;

public class ControllerUniversity {
    private University model;
    private UniversityView view;

    public ControllerUniversity(University model, UniversityView view) {
        this.model = model;
        this.view = view;
    }


    public String getName() {
        return model.getName();
    }

    public List<Faculty> getFaculty() {
        return model.getFaculties();
    }

    public void updateUniversityView() {
        view.printUniversityDetails(model.getName(), model.getFaculties());
    }
}
