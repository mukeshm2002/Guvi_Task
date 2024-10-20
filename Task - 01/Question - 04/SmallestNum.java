import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest number using conditional statements
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
