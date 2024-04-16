package Controller;

import Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    private List<Employee> employees;
    public EmployeeController() {
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void showAllEmployees() {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println("--------------");
        }
    }
    public Employee findEmployeeByID(int ID) {
        for (Employee employee : employees) {
            if (employee.ID == ID) {
                return employee;
            }
        }
        return null;
    }
    public void updateEmployee(Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.ID == updatedEmployee.ID) {
                employee = updatedEmployee;
                return;
            }
        }
    }
    public void deleteEmployee(int ID) {
        employees.removeIf(employee -> employee.ID == ID);
    }
}
