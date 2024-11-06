public class Main {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Mukesh", 22);
            System.out.println(voter1);
            Voter voter2 = new Voter(2, "Abi", 18);
            System.out.println(voter2);
            Voter voter3 = new Voter(3, "Arvind", 17);
            System.out.println(voter3);
        } catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

