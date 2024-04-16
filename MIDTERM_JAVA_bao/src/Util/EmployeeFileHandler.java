package Util;

import Controller.EmployeeController;

import java.io.*;


public class EmployeeFileHandler {
    public static void writeEmployeesToFile(String filePath, EmployeeController controller) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(controller);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static EmployeeController readEmployeesFromFile(String filePath) {
        EmployeeController controller = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            controller = (EmployeeController) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return controller;
    }
}
