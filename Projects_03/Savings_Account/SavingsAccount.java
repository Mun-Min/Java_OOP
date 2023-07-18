// This is the SavingsAccount class that extends the BankAccount class.

public class SavingsAccount extends BankAccount {
    
    // Method to debit funds from the savings account.
    public boolean debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    // Method to apply interest to the savings account balance.
    public void applyInterest() {
        if (balance > 0) {
            double interestAmount = balance * interestRate;
            balance += (int) interestAmount;
        }
    }
    
    // Method to get account information for the savings account.
    public String accountInfo() {
        String info = "Type of Account : Savings\n";
        info += "Account ID      : " + getAccountID() + "\n";
        info += "Current Balance : $" + String.format("%.2f\n", (balance / 100.0));
        info += "Interest rate   : " + String.format("%.2f%%\n", (interestRate * 100));
        return info;
    }
}