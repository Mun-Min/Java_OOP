// This is the abstract BankAccount class that defines the basic structure of a bank account.

public abstract class BankAccount {
    // Common attributes for all bank accounts: accountID, interestRate, and balance.
    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate = 0.0;
    protected int balance = 0;
    
    // Credit method to add funds to the account.
    public boolean credit(int amount) {
        balance += amount;
        return true;
    }
    
    // Abstract method for debiting funds from the account. Implemented by subclasses.
    public abstract boolean debit(int amount);
    
    // Get the current balance of the account.
    public int getBalance() {
        return balance;
    }
    
    // Get the account ID.
    public String getAccountID() {
        return accountID;
    }
    
    // Set the account ID.
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    
    // Get the interest rate.
    public double getInterestRate() {
        return interestRate;
    }
    
    // Set the interest rate.
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    // Abstract method to apply interest to the account balance. Implemented by subclasses.
    public abstract void applyInterest();
    
    // Abstract method to get account information. Implemented by subclasses.
    public abstract String accountInfo();
}