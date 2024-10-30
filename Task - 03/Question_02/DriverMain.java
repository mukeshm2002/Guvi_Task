import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee Monthly Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        double incomeTax = employee.calcTax();

        // Input for Product
        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        double salesTax = product.calcTax();

        // Display results
        System.out.println("\n--- Tax Calculations ---");
        System.out.println(employee);
        System.out.printf("Income Tax (Yearly): %.2f%n", incomeTax);

        System.out.println(product);
        System.out.printf("Sales Tax (Per Unit): %.2f%n", salesTax);

        scanner.close();
    }
}
