// Derived class TestAccount to test the functionality of BankAccount
// Do not make any changes to this file.

public class TestAccount extends BankAccount {
   // Override the debit method to debit the specified amount (in pennies) from the account
   public boolean debit(int pennies) {
       this.balance -= pennies;
       return true;
   }
    
   // Override the applyInterest method to apply interest to the account balance
   public void applyInterest() {
       this.balance += (this.interestRate * this.balance);
   }
    
   // Override the accountInfo method to provide account information
   public String accountInfo() {
       // Format the balance in dollars and cents (2 decimal places)
       return "TestAccount with Balance = " + String.format("$%.2f\n", (this.balance / 100.0));
   }
}