import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    // HashMap to store student names and their grades
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Added: " + name + " with grade " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions: 1) Add Student 2) Remove Student 3) Display Grade 4) Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    studentGrades.addStudent(nameToAdd, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    studentGrades.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    studentGrades.displayGrade(nameToDisplay);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
