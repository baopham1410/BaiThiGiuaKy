package View;

import Controller.EmployeeController;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import Util.EmployeeFileHandler;

public class Main {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();

        // Thêm nhân viên
        Experience expEmployee = new Experience(1, "Bao Pham", "14/10/2005", "0383435600",
                "phambao1410@gmail.com", "khong kinh nghiem", 5, "Java");
        controller.addEmployee(expEmployee);

        Fresher fresherEmployee = new Fresher(2, "Anh cuong", "01/01/2005", "0383435600",
                "phambao141@gmail.com", "kinh nghiem", "01/01/2030", "Excellent",
                "VH University");
        controller.addEmployee(fresherEmployee);

        Intern internEmployee =
                new Intern(3, "huuT", "01/01/2005", "0383435600", "NYQB@gmail.com",
                        "Kinh Nghiệm", "Computer Science", "Spring 2024", "VH University");
        controller.addEmployee(internEmployee);

        // Hiển thị thông tin các nhân viên
        controller.showAllEmployees();

        // Ghi và đọc từ file
        EmployeeFileHandler.writeEmployeesToFile("employees.dat", controller);
        EmployeeController newController =
                EmployeeFileHandler.readEmployeesFromFile("employees.dat");

        // Hiển thị thông tin các nhân viên từ controller mới
        newController.showAllEmployees();
    }
}
