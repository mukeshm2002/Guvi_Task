import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGiftStudents {
    public static void main(String[] args) {
        // Create a List of student names
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Annie", "John", "Arjun", "David", "Adam", "Eve", "Amit", "Raj");

        // Use Stream API to filter names starting with "A" and collect them into a list
        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the list of students receiving special gifts
        System.out.println(specialGiftStudents);
    }
}
