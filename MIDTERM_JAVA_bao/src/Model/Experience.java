package Model;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience(int ID, String fullName, String birthDay, String phone, String email,
                      String employeeType, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Experience in Years: " + expInYear);
        System.out.println("Professional Skill: " + proSkill);
    }


}
