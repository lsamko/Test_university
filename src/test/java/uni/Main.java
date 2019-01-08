package uni;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        StudentView view = new StudentView();
//        GroupView view1 = new GroupView();
//        FacultyView view2 = new FacultyView();

//        List<Student> model = getStudentsByAge(students);
//        List<Group> model1;
//        List<Faculty>model2
//        List<University> model;
//        ControllerStudent controllerStudent = new ControllerStudent( model, view);
//        ControllerGroup controllerGroup = new ControllerGroup(model1,view1);
//        ControllerFaculty controllerFaculty = new ControllerFaculty(model2,view2);
//        controllerStudent.updateStudentsView();
//        controllerGroup.updateGroupsView();
//        controllerFaculty.updateGroupsView();

        Student student1 = new Student("Ola", "A", 19, Arrays.asList(90, 78, 80, 98, 100));
        Student student2 = new Student("Toma", "B", 26, Arrays.asList(100, 88, 97, 66, 95));
        Student student3 = new Student("Siusy", "C", 20, Arrays.asList(12, 17, 4, 45, 30));
        Student student4 = new Student("Lola", "D", 23, Arrays.asList(99, 95, 100, 89, 91));
        Student student5 = new Student("Michel", "E", 25, Arrays.asList(91, 98, 78, 50, 10));
        Student student6 = new Student("Vova", "F", 25, Arrays.asList(30, 66, 54, 74, 36));
        Student student7 = new Student("Toma", "G", 26, Arrays.asList(67, 89, 96, 79, 55));
        Student student8 = new Student("Susy", "H", 20, Arrays.asList(0, 11, 18, 57, 0));
        Student student9 = new Student("Lola", "I", 23, Arrays.asList(99, 100, 96, 84, 95));
        Student student10 = new Student("Michel", "K", 25, Arrays.asList(0, 89, 0, 18, 9));
        Student student11 = new Student("Vova", "L", 19, Arrays.asList(30, 27, 89, 76, 62));
        Student student12 = new Student("Ola", "M", 27, Arrays.asList(90, 89, 91, 78, 99));
        Student student13 = new Student("Kope", "N", 18, Arrays.asList(45, 54, 53, 20, 0));
        Student student14 = new Student("Mimi", "O", 19, Arrays.asList(89, 88, 92, 80, 76));
        Student student15 = new Student("Ella", "P", 25, Arrays.asList(36, 64, 50, 52, 67));
        Student student16 = new Student("Cia", "Q", 29, Arrays.asList(45, 0, 88, 64, 32));
        Student student17 = new Student("Toto", "R", 22, Arrays.asList(95, 99, 84, 70, 98));
        Student student18 = new Student("Sam", "S", 20, Arrays.asList(48, 54, 32, 80, 90));
        Student student19 = new Student("Liu", "T", 23, Arrays.asList(99, 100, 93, 84, 90));
        Student student20 = new Student("Nini", "W", 25, Arrays.asList(91, 82, 100, 88, 72));
        Student student21 = new Student("Victor", "X", 25, Arrays.asList(100, 100, 100, 100, 100));
        Student student22 = new Student("Tolla", "Y", 26, Arrays.asList(48, 54, 32, 80, 90));
        Student student23 = new Student("Susanna", "Z", 20, Arrays.asList(48, 54, 0, 79, 55));
        Student student24 = new Student("Lola", "Xo", 23, Arrays.asList(99, 89, 96, 74, 100));
        Student student25 = new Student("Michel", "Cv", 25, Arrays.asList(67, 84, 20, 88, 15));
        Student student26 = new Student("Vova", "We", 19, Arrays.asList(32, 18, 63, 79, 55));
        Student student27 = new Student("Ola", "Tu", 27, Arrays.asList(67, 62, 96, 71, 53));
        Student student28 = new Student("Kope", "UI", 18, Arrays.asList(78, 23, 96, 0, 14));
        Student student29 = new Student("Lico", "Po", 19, Arrays.asList(89, 89, 89, 89, 89));
        Student student30 = new Student("Lobo", "Mr", 25, Arrays.asList(36, 71, 0, 64, 95));

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8,
                student9, student10, student11, student12, student13, student14, student15, student16, student17, student18,
                student19, student20, student21, student22, student23, student24, student25, student26, student27,
                student28, student29, student30);


//        Group group1 = new Group("Medical devices and systems", 1, Arrays.asList(student21, student5, student18, student14, student25));
//        Group group2 = new Group("Foundry Department", 2, Arrays.asList(student2, student3, student7, student17, student26));
//        Group group3 = new Group("Radio communication and signal processing", 3, Arrays.asList(student4, student6, student9, student11, student12));
//        Group group4 = new Group("Department of production of devices", 4, Arrays.asList(student8, student20, student27, student10, student13));
//        Group group5 = new Group("Intellectual Technologies", 1, Arrays.asList(student30, student28, student23, student22, student29));
//        Group group6 = new Group("Department of Metal Physics", 2, Arrays.asList(student15, student16, student24, student19, student21));

//        List<Group> groups = Arrays.asList(group1);

//        Faculty faculty1 = new Faculty("Medicalscience", Arrays.asList(group1, group2));
//        Faculty faculty2 = new Faculty("Radioscience", Arrays.asList(group3, group4));
//        Faculty faculty3 = new Faculty("Computescience", Arrays.asList(group5, group6));
//        List<Faculty> faculties = Arrays.asList(faculty1, faculty2, faculty3);

//        University uni = new University("Politekhnika", Arrays.asList(faculty1, faculty2, faculty3));

//        List<University> universities = Arrays.asList(uni);

        Map<Integer, Student> hashMap = new HashMap<>();
//        hashMap.put(1, student1);
//        hashMap.put(2, student2);
//        hashMap.put(3, student3);
//        hashMap.put(4, student4);
//        hashMap.put(5, student5);
//        hashMap.put(6, student6);
//        hashMap.put(7, student7);
        hashMap.put(8, student8);
        hashMap.put(9, student9);
        hashMap.put(21, student21);
        hashMap.put(11, student11);
        hashMap.put(22, student22);
//        hashMap.put(12, student12);
//        hashMap.put(13, student13);
//        hashMap.put(14, student14);
//        hashMap.put(15, student15);
//        hashMap.put(16, student16);
//        hashMap.put(17, student17);
//        hashMap.put(18, student18);

//        getStudentsByFacultyAndByAge(faculties, groups, 23, "Computescience");
//        System.out.println();
//        getStudentsByMarkandByGroup(groups, 2, 90);
//        System.out.println();
//        getAverageOfMarks(groups);
//        System.out.println();
        // getStudentWithHighestAverageOfMarks(hashMap);
//        getIdentificator();

//        getIdByStudent(hashMap, student15);
        getStudentWithMinAverageOfMarks(hashMap);

    }

    private static List<Student> getStudentsByFacultyAndByAge(List<Faculty> faculties, List<Group> groups, int age, String facultyName) {
        List<Student> students = new ArrayList<>();
        for (Faculty faculty : faculties) {
            if (faculty.getName().equals(facultyName)) {
                for (Group group : groups) {
                    for (Student st : group.getStudents()) {
                        if (st.getAge() >= age) {
                            students.add(st);
                            System.out.println("This students age is > 23 and study in Computerscience faculty: " + st + faculty.name);
                        }
                    }
                }

            }
        }
        return students;

    }

    private static List<Student> getStudentsByMarkandByGroup(List<Group> groups, int num, int m) {
        List<Student> students = new ArrayList<>();
        for (Group group : groups) {
            if (group.getNum() == num) {
                for (Student st : group.getStudents()) {
                    if (st.getMark().stream().mapToInt(Integer::intValue).sum() >= m) {
                        students.add(st);
                        System.out.println("This students study in group # 2 and have highest mark: " + st + group.group);
                    }
                }
            }
        }
        return students;
    }

    private static List<Student> getAverageOfMarks(List<Group> groups) {
        List<Student> students = new ArrayList<>();
        for (Group group : groups) {
            for (Student st : group.getStudents()) {
                OptionalDouble average = st.getMark().stream().mapToInt(Integer::intValue).average();
                System.out.println("This is average all of Student: " + average);
            }

        }
        return students;
    }


    private static double getAverageValue(List<Integer> marks) {
        double average = 0;
        double sum = 0;

        for (int i = 0; i < marks.size(); i++) {
            sum += marks.get(i);
        }
        average = sum / marks.size();
        System.out.println("This is average of Student: " + average);

        return average;
    }


    //TODO print only 1 user with highest rate not all
    private static List<Student> getStudentWithHighestAverageOfMarks(Map<Integer, Student> studentsMap) {
        List<Student> students = new ArrayList<>();
        double averageMark;
        double max = Double.NEGATIVE_INFINITY;
        Student student;
        List<Student> studentsList = studentsMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        for (Student st : studentsList) {
            averageMark = getAverageValue(st.getMark());
            if (averageMark >= max) {
                max = averageMark;
                student = st;
                students.add(student);
            }
        }

        for (Student st : students) {
            getIdentificatorByStudent(studentsMap, st);
        }

        return studentsList;

    }

    private static Integer getIdentificatorByStudent(Map<Integer, Student> studentMap, Student student) {
        for (Integer id : studentMap.keySet()) {
            if (studentMap.get(id).equals(student)) {
                System.out.println("Student ID is: " + id);
                return id;
            }

        }
        System.out.println(studentMap.size());
        return null;
    }


    private static List<Student> getStudentWithMinAverageOfMarks(Map<Integer, Student> studentsMap) {
        List<Student> students = new ArrayList<>();
        double averageMinMark = 0;
        double min = Double.MAX_VALUE;
        Student student = null;
        List<Student> studentsList = studentsMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        for (Student st : studentsList) {
            averageMinMark = getAverageValue(st.getMark());
            if (averageMinMark < min) {
                min = averageMinMark;
                student = st;
                students.add(student);

            }
        }
        for (Student st : students) {
            getIdentificatorByStudent(studentsMap, st);
        }
        System.out.println("Min mark: " + min + " Finish him! " + student);
        System.out.println(studentsMap.size());
        studentsMap.remove(student);
        System.out.println(studentsMap.size());


        return studentsList;
    }


}

















