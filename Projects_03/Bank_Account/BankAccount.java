// Implement your BankAccount class in this file
public abstract class BankAccount {
    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate = 0.0;
    protected int balance = 0;
    
    public boolean credit(int amount) {
        balance += amount;
        return true;
    }
    
    public abstract boolean debit(int amount);
    
    public int getBalance() {
        return balance;
    }
    
    public String getAccountID() {
        return accountID;
    }
    
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public abstract void applyInterest();
    
    public abstract String accountInfo();
}
