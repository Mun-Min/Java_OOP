// Abstract class BankAccount that defines the basic structure for all bank accounts

public abstract class BankAccount {
    protected String accountID = "0000-0000-0000-0000"; // Default account ID
    protected double interestRate = 0.0; // Default interest rate
    protected int balance = 0; // Balance of the account in pennies
    
    // Credit the specified amount (in pennies) to the account and return true if successful
    public boolean credit(int amount) {
        balance += amount;
        return true;
    }
    
    // Abstract method to be implemented by derived classes to debit the specified amount (in pennies) from the account
    public abstract boolean debit(int amount);
    
    // Get the balance of the account in pennies
    public int getBalance() {
        return balance;
    }
    
    // Get the account ID
    public String getAccountID() {
        return accountID;
    }
    
    // Set the account ID
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    
    // Get the interest rate
    public double getInterestRate() {
        return interestRate;
    }
    
    // Set the interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    // Abstract method to be implemented by derived classes to apply interest to the account balance
    public abstract void applyInterest();
    
    // Abstract method to be implemented by derived classes to provide account information
    public abstract String accountInfo();
}