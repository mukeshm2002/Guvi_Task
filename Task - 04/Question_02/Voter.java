// Define a custom exception
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

// Define the Voter class
public class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getters for accessing private fields (optional)
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method to display voter information (optional)
    @Override
    public String toString() {
        return "Voter ID: " + voterId + ", Name: " + name + ", Age: " + age;
    }
}
