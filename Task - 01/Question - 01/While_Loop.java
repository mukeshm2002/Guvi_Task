import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);
        // Read the start number from user input
        System.out.println("Enter the Starting Number :");
        int start = scan.nextInt();
        // Read the end number from user input
        System.out.println("Enter the Ending Number :");
        int end = scan.nextInt();
        int i = start ;
        // This 'while' loop will continue to run as long as 'i' is less than or equal to 'end'
        while(i <= end){
            System.out.println(i);
            i++;
        }
        scan.close();
    }
}
