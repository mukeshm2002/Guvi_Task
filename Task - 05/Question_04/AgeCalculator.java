import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for the birthdate input in yyyy-mm-dd format
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthDateInput = scanner.nextLine();

        // Parse the input string to LocalDate
        LocalDate birthDate = LocalDate.parse(birthDateInput);
        LocalDate currentDate = LocalDate.now(); // Get the current date

        // Calculate the period between the birthdate and the current date
        Period age = Period.between(birthDate, currentDate);

        // Print the age in years, months, and days
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());
    }
}
