// The BankAccount class is an abstract class that serves as the base for different types of bank accounts.

public abstract class BankAccount {
    protected String accountID = "0000-0000-0000-0000"; // The account ID, initialized to a default value.
    protected double interestRate = 0.0; // The interest rate for the account, initialized to 0.0.
    protected int balance = 0; // The current balance of the account, initialized to 0.

    // Credit the account with the given amount.
    public boolean credit(int amount) {
        balance += amount;
        return true; // Return true to indicate the operation was successful.
    }

    // Abstract method for debiting the account with the given amount. Subclasses will provide their implementation.
    public abstract boolean debit(int amount);

    // Get the current balance of the account.
    public int getBalance() {
        return balance;
    }

    // Get the account ID.
    public String getAccountID() {
        return accountID;
    }

    // Set the account ID with the provided value.
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    // Get the interest rate.
    public double getInterestRate() {
        return interestRate;
    }

    // Set the interest rate with the provided value.
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Abstract method to apply interest to the account balance. Subclasses will provide their implementation.
    public abstract void applyInterest();

    // Abstract method to get account information as a formatted string. Subclasses will provide their implementation.
    public abstract String accountInfo();
}