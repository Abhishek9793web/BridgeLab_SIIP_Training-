import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Employee {

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee emp = (Employee) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Designation: " + designation;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("<============>");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        Employee emp1 = new Employee("Saju", 111, "QA");
        Employee emp2 = new Employee("Ram", 112, "Project Manager");
        Employee emp3 = new Employee("am", 112, "Project Manager"); // Duplicate ID
        Employee emp4 = new Employee("Shyam", 113, "Developer");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3); // Will not be added
        employees.add(emp4);

        // Display all employees
        for (Employee e : employees) {
            e.displayEmployeeDetails();
        }



        // Sorting by name using TreeSet with Comparator
        TreeSet<Employee> sortedByName = new TreeSet<>(Comparator.comparing(e -> e.getName()));
        sortedByName.addAll(employees);

        System.out.println("\nEmployees sorted by name:");
        for (Employee e : sortedByName) {
            System.out.println(e);
        }
    }
}
