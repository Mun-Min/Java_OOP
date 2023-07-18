// This is the abstract base class for all types of bank accounts.

public abstract class BankAccount {
    // Common attributes for all bank accounts
    protected String accountID = "0000-0000-0000-0000"; // Default account ID
    protected double interestRate = 0.0; // Default interest rate as a decimal (0% by default)
    protected int balance = 0; // Default account balance in cents ($0.00 by default)

    // Method to credit the account with a given amount
    public boolean credit(int amount) {
        balance += amount; // Increment the account balance by the given amount
        return true; // Return true to indicate that the transaction was successful
    }

    // Abstract method to debit the account with a given amount (to be implemented by subclasses)
    public abstract boolean debit(int amount);

    // Method to get the current account balance
    public int getBalance() {
        return balance;
    }

    // Method to get the account's unique ID
    public String getAccountID() {
        return accountID;
    }

    // Method to set the account's unique ID
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    // Method to get the account's interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Method to set the account's interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Abstract method to apply interest to the account balance (to be implemented by subclasses)
    public abstract void applyInterest();

    // Abstract method to generate account information (to be implemented by subclasses)
    public abstract String accountInfo();
}
