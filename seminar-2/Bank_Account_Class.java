// Exercise 3.1: Bank Account Class
// Create a BankAccount class that demonstrates proper encapsulation:

// Requirements:

// Private Attributes: - accountNumber (String) - balance (double) - accountHolderName (String)
// Constructor: Initialize all attributes
// Public Methods: - getAccountNumber(): Return account number - getBalance(): Return current balance - getAccountHolderName(): Return account holder name - deposit(double amount): Add money (validate amount > 0) - withdraw(double amount): Remove money (validate sufficient funds) - transfer(BankAccount other, double amount): Transfer money to another account
// Validation Rules: - Deposit amounts must be positive - Withdrawal amounts must be positive and <= balance - Transfer amounts must be valid for withdrawal
// Test Your Implementation:

// Create multiple accounts and test all operations, including invalid operations.

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    
    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void deposit (double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            throw new IllegalArgumentException("Insufrient funds - You do not have enough money. OR: You must withdraw more than 0");
        }
        this.balance -= amount;
    }

    public void transfer(BankAccount other, double amount) {
        if (amount > balance || amount <= 0) {
            throw new IllegalArgumentException("Insufrient funds - You do not have enough money. OR: You must transfeer more than 0");
        }
        this.balance -= amount;
        other.deposit(amount);
    }
}

public class Bank_Account_Class {
    public static void main(String[] args) {
        BankAccount alice = new BankAccount("A001", 500.0, "Alice");
        BankAccount bob   = new BankAccount("B002", 200.0, "Bob");

        System.out.println("Initial balances:");
        printBalances(alice, bob);

        // Valid deposit
        alice.deposit(150.0);
        System.out.println("\nAfter Alice deposits 150:");
        printBalances(alice, bob);

        // Invalid deposit
        try {
            bob.deposit(0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nInvalid deposit attempted for Bob: " + e.getMessage());
        }

        // Valid withdraw
        bob.withdraw(50.0);
        System.out.println("\nAfter Bob withdraws 50:");
        printBalances(alice, bob);

        // Invalid withdraw (too large)
        try {
            bob.withdraw(1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nInvalid withdraw attempted for Bob: " + e.getMessage());
        }

        // Valid transfer (Alice -> Bob)
        alice.transfer(bob, 200.0);
        System.out.println("\nAfter Alice transfers 200 to Bob:");
        printBalances(alice, bob);

        // Invalid transfer (insufficient funds)
        try {
            alice.transfer(bob, 1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nInvalid transfer attempted from Alice to Bob: " + e.getMessage());
        }

        // Invalid transfer (negative amount)
        try {
            bob.transfer(alice, -10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nInvalid transfer attempted from Bob to Alice: " + e.getMessage());
        }

        System.out.println("\nFinal balances:");
        printBalances(alice, bob);
    }

    private static void printBalances(BankAccount... accounts) {
        for (BankAccount a : accounts) {
            System.out.printf("%s (%s): %.2f%n", a.getAccountHolderName(), a.getAccountNumber(), a.getBalance());
        }
    }
}
