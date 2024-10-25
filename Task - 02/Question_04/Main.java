// Base class Person
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Employee that extends Person
class Employee extends Person {
    String employeeID;
    double salary;

    // Constructor for Employee
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Initialize name and age in the superclass
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        // Display the inherited attributes
        super.displayPersonInfo();
        // Display additional attributes
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Mukesh M", 22, "E2002", 15000);
        emp.displayEmployeeInfo();
    }
}
