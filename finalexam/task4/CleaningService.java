package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CleaningService implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Employee> employees = new ArrayList<>();

    public CleaningService(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public boolean deleteEmployee(Employee e) {
        return employees.remove(e);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void saveEmployeesToFile(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
        }
    }

    public void loadEmployeesFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            employees = (List<Employee>) ois.readObject();
        }
    }
}
