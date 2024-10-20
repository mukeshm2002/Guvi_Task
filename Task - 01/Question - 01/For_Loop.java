import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);
        // Prompt the user to enter the starting number
        System.out.println("Enter the Starting Number :");
        int start = scan.nextInt();
        // Prompt the user to enter the ending number
        System.out.println("Enter the Ending Number :");
        int end = scan.nextInt();
        // This 'for' loop will start from the value of 'start' and continue until it reaches 'end'
        // It increments the value of 'i' by 1 in each iteration
        for(int i = start ; i <= end ; i++){
            System.out.println(i);
        }
        scan.close();

    }
}