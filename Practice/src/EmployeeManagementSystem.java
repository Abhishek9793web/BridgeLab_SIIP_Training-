
class Employee {

    private String name;
    private final int id; // Final variable to ensure the employee ID cannot be modified
    private String designation;


    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;

    }
    // To avoid duplicate ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee emp = (Employee) o;
        return id == emp.id;
    }
    public void displayEmployeeDetails() {
        // Use 'instanceof' to verify the object's
        if (this instanceof Employee) {

            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("<============>");
        } else {
            System.out.println("The object is not an instance of the Employee class.");
        }
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
public class Employee_management_system {

    public static void main(String[] args) {


        Employee emp1 = new Employee("raju", 111, "QA");
        Employee emp2 = new Employee("Ram", 112, "Project Manager");
        Employee emp3 = new Employee("Ram", 112, "Project Manager");
        Employee emp4 = new Employee("Ram", 112, "Project Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();

    }

}