// The CheckingAccount class extends the BankAccount class to represent a checking account.

public class CheckingAccount extends BankAccount {
    private int overdraftFee = 0; // The fee to be charged when the account goes into overdraft.

    // Debit the account with the given amount.
    public boolean debit(int amount) {
        balance -= amount;

        // If the account goes into overdraft (balance < 0), deduct the overdraft fee.
        if (balance < 0) {
            balance -= overdraftFee;
        }

        return true; // Return true to indicate the operation was successful.
    }

    // Set the overdraft fee with the provided value.
    public void setFee(int fee) {
        overdraftFee = fee;
    }

    // Get the overdraft fee.
    public int getFee() {
        return overdraftFee;
    }

    // Apply interest to the account balance if it is positive.
    public void applyInterest() {
        if (balance > 0) {
            double interestAmount = balance * interestRate;
            balance += (int) interestAmount;
        }
    }

    // Get account information as a formatted string, specific to checking accounts.
    public String accountInfo() {
        String info = "Type of Account : Checking\n";
        info += "Account ID      : " + getAccountID() + "\n";
        info += "Current Balance : $" + String.format("%.2f\n", (balance / 100.0));
        info += "Interest rate   : " + String.format("%.2f%%\n", (interestRate * 100));
        info += "Overdraft Fee   : $" + String.format("%.2f\n", (overdraftFee / 100.0));
        return info;
    }
}