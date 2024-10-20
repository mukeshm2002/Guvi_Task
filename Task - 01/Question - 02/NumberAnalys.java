import java.util.Scanner;

public class NumberAnalys {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);
        // Ask the user to enter a number
        System.out.println("Enter a Number");
        double Number = scan.nextDouble();
        // Check if the number is positive, negative, or zero
        //use Conditional Statement
        if(Number > 0){
            System.out.println(Number + "is Positive Number");
        } else if (Number < 0) {
            System.out.println(Number + "is Negative Number");
        }
        else {
            System.out.println("Number is zero");
        }

    }
}