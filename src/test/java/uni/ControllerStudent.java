package uni;

import java.util.List;

public class ControllerStudent {

    private Student model;
    private StudentView view;

    public ControllerStudent(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }


    public String getLastName() {
        return model.getLastName();
    }



    public int getAge() {
        return model.getAge();
    }



    public List<Integer> getMark() {
        return getMark();
    }


    public void updateStudentsView() {
        view.printStudentDetails(model.getFirstName(), model.getLastName(), model.getAge(), model.getMark());

    }
}

