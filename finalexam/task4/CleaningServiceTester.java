package finalexam.task4;

import java.io.IOException;

public class CleaningServiceTester {
    public static void main(String[] args) {
        CleaningService service = new CleaningService("123 Main St", "VAT123456");

        Employee employee1 = new Employee("Alice", "Brown", "E001");
        Employee employee2 = new Employee("Bob", "Smith", "E002");

        service.addEmployee(employee1);
        service.addEmployee(employee2);

        System.out.println("Employees after adding:");
        for (Employee e : service.getEmployees()) {
            System.out.println(e);
        }

        try {
            service.saveEmployeesToFile("employees.dat");
            service = new CleaningService("123 Main St", "VAT123456");
            service.loadEmployeesFromFile("employees.dat");

            System.out.println("Employees after loading from file:");
            for (Employee e : service.getEmployees()) {
                System.out.println(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        service.deleteEmployee(employee1);

        System.out.println("Employees after deleting Alice Brown:");
        for (Employee e : service.getEmployees()) {
            System.out.println(e);
        }
    }
}
