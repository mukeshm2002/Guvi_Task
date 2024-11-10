import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseConversion {
    public static void main(String[] args) {
        // Create a Stream of Strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Use map() to convert each string to uppercase and collect them into a list
        List<String> upperCaseNames = names.map(String::toUpperCase).collect(Collectors.toList());

        // Print the resulting list
        System.out.println(upperCaseNames);
    }
}
