import java.util.Scanner;

class Employee2 {
    int employeeId;
    String name;
    String position;
    double salary;
    public Employee2(int employeeId, String name,
                    String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public void display() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}
class EmployeeManagement {
    private Employee2[] employees;
    private int count;
    public EmployeeManagement(int size) {
        employees = new Employee2[size];
        count = 0;
    }
    public void addEmployee(Employee2 emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
            System.out.println("Employee Added Successfully.");
        } else {
            System.out.println("Array is Full. Cannot add employee.");
        }
    }

    // Search for Employee
    public Employee2 searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse the Employees
    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No Employees Found.");
            return;
        }

        System.out.println("\nEmployee Records:");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    // Delete the Employee
    public void deleteEmployee(int id) {
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found.");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted Successfully.");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        EmployeeManagement manager =
                new EmployeeManagement(10);

        manager.addEmployee(
                new Employee2(101, "John", "Manager", 75000));

        manager.addEmployee(
                new Employee2(102, "Alice", "Developer", 60000));

        manager.addEmployee(
                new Employee2(103, "Bob", "Tester", 50000));

        System.out.println("\nAll Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching Employee ID 102:");
        Employee2 emp = manager.searchEmployee(102);

        if (emp != null) {
            emp.display();
        } else {
            System.out.println("Employee Not Found.");
        }

        System.out.println("\nDeleting Employee ID 102");
        manager.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");
        manager.traverseEmployees();
    }
}