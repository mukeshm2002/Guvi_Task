import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> strings = Arrays.asList("abc", "be", "efg", "abcd", "", "jkl");

        // Use filter() to remove empty strings and collect non-empty strings into a list
        List<String> nonEmptyStrings = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println(nonEmptyStrings);
    }
}
