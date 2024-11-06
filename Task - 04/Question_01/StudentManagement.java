// Define the custom exception for age range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Define the custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Define the Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor to initialize the Student class
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.setName(name);  // Set name using the setter method to validate
        this.setAge(age);    // Set age using the setter method to validate
        this.course = course;
    }

    // Setter for name with validation
    public void setName(String name) throws NameNotValidException {
        // Check if the name contains only alphabets
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name should not contain numbers or special characters.");
        }
        this.name = name;
    }

    // Setter for age with validation
    public void setAge(int age) throws AgeNotWithinRangeException {
        // Check if age is within the valid range
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

// Main class to test the Student class
public class StudentManagement {
    public static void main(String[] args) {
        try {
            // Valid student
            Student student1 = new Student(101, "JohnDoe", 18, "Computer Science");
            student1.display();

            // This student will cause an AgeNotWithinRangeException
            Student student2 = new Student(102, "JaneDoe", 14, "Mathematics");
            student2.display();

        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // This student will cause a NameNotValidException
            Student student3 = new Student(103, "Jack123", 20, "Physics");
            student3.display();

        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
