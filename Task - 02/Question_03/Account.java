public class Account {
    // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two arguments (initial balance)
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit an amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Creating an account with no initial balance
        Account account1 = new Account();
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayBalance();

        // Creating an account with an initial balance of 1000
        Account account2 = new Account(1000);
        account2.deposit(300);
        account2.withdraw(400);
        account2.displayBalance();
    }
}
