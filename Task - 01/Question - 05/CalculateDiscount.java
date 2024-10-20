import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the purchase amount
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        // Variable to store the final payable amount
        double finalAmount;

        // Calculate the discount based on the purchase amount
        if (purchaseAmount < 500) {
            finalAmount = purchaseAmount;  // No discount
        } else if (purchaseAmount <= 1000) {
            finalAmount = purchaseAmount - (purchaseAmount * 0.10);  // 10% discount
        } else {
            finalAmount = purchaseAmount - (purchaseAmount * 0.20);  // 20% discount
        }

        // Display the final payable amount
        System.out.println("The final payable amount is: " + finalAmount);

        // Close the scanner
        scanner.close();
    }
}
