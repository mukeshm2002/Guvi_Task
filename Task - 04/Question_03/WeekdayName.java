import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        // Array to store the names of the weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day position (0-6): ");
        int dayIndex = scanner.nextInt();

        try {
            // Try to access the day name at the specified index
            System.out.println("Day: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception if the index is out of bounds
            System.out.println("Error: Invalid day position. Please enter a number between 0 and 6.");
        }

        // Close the scanner
        scanner.close();
    }
}
