public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return salary * 12 * INCOME_TAX; // Annual income tax
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name + ", Monthly Salary: " + salary;
    }
}
