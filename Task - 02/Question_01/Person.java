public class Person {
    // Properties
    private String name;
    private  int age;

    // Default constructor with default age of 18
    public Person() {
        this.age = 18;
        this.name = "unknownName" ;
    }    // Constructor to initialize with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Person person1 = new Person();
        person1.displayPersonInfo();

        // Using parameterized constructor
        Person person2 = new Person("Mukesh M", 22);
        person2.displayPersonInfo();
    }
}
