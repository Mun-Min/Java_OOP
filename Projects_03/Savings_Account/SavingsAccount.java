// Implement your SavingsAccount class in this file
public class SavingsAccount extends BankAccount {
    
    public boolean debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public void applyInterest() {
        if (balance > 0) {
            double interestAmount = balance * interestRate;
            balance += (int) interestAmount;
        }
    }
    
    public String accountInfo() {
        String info = "Type of Account : Savings\n";
        info += "Account ID      : " + getAccountID() + "\n";
        info += "Current Balance : $" + String.format("%.2f\n", (balance / 100.0));
        info += "Interest rate   : " + String.format("%.2f%%\n", (interestRate * 100));
        return info;
    }
}
