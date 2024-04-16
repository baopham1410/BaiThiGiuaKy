package Model;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;

    public Intern(int ID, String fullName, String birthDay, String phone, String email,
                  String employeeType, String majors, String semester, String universityName) {
        super(ID, fullName, birthDay, phone, email, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Majors: " + majors);
        System.out.println("Semester: " + semester);
        System.out.println("University Name: " + universityName);
    }


}
