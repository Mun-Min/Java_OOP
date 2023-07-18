// This class represents a specific type of bank account, i.e., a Credit Card Account.

import java.text.DecimalFormat;

public class CreditcardAccount extends BankAccount {
    // Additional attribute specific to Credit Card Account
    private int limit; // The credit limit of the account in cents ($0.00 by default)

    // Method to set the credit limit of the account
    public void setLimit(int limit) {
        this.limit = limit;
    }

    // Method to get the credit limit of the account
    public int getLimit() {
        return limit;
    }

    // Overriding the debit method to handle credit card account-specific debits
    @Override
    public boolean debit(int amount) {
        // Check if the account balance after debit is within the credit limit (not going below -limit)
        if (balance - amount >= -limit) {
            balance -= amount; // Deduct the amount from the account balance
            return true; // Return true to indicate that the transaction was successful
        }
        return false; // Return false to indicate that the transaction was unsuccessful
    }

    // Overriding the applyInterest method to handle credit card account-specific interest calculation
    @Override
    public void applyInterest() {
        if (balance < 0) {
            // Calculate interest amount based on the negative balance and the interest rate
            double interestAmount = balance * getInterestRate();
            balance += (int) interestAmount; // Convert and add the interest amount to the account balance
        }
    }

    // Overriding the accountInfo method to generate credit card account-specific account information
    @Override
    public String accountInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00"); // Format currency values
        String formattedBalance = decimalFormat.format(Math.abs((double) balance) / 100); // Format the account balance
        String formattedInterestRate = decimalFormat.format(getInterestRate() * 100); // Format the interest rate as a percentage

        // Construct and return the account information string
        return "Type of Account : Creditcard\n" +
                "Account ID      : " + getAccountID() + "\n" +
                "Current Balance : $" + formattedBalance + "\n" +
                "Interest rate   : " + formattedInterestRate + "%\n" +
                "Credit Limit    : $" + decimalFormat.format((double) limit / 100);
    }
}