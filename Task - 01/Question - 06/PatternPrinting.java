import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of i, j, and k
        System.out.print("Enter the value for i (number of rows): ");
        int i = scanner.nextInt();

        System.out.print("Enter the value for j (number of columns): ");
        int j = scanner.nextInt();

        System.out.print("Enter the value for k (starting number): ");
        int k = scanner.nextInt();

        // Close the scanner as we have all the inputs
        scanner.close();

        // Generate and print the pattern
        for (int row = 0; row < i; row++) {
            // Start with 'k' and print the decreasing pattern
            for (int col = 0; col < j; col++) {
                if (col < row) {
                    System.out.print(k - row + col);  // Print values that decrease after each row
                } else {
                    System.out.print(k - row);  // Print fixed numbers at the end
                }
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
