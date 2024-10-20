import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the reversed number
        int reversedNum = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to reversedNumber
            number = number / 10; // Remove the last digit
        }

        // Output the reversed number
        System.out.println("Reversed Number: " + reversedNum);

        // Close the scanner
        scanner.close();
    }
}
