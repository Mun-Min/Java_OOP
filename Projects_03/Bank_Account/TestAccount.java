// This class is provided as a simple derived class 
// to extend and implement the BankAccount abstract class 
// for testing purposes. You cannot make any changes to this file.

public class TestAccount extends BankAccount {

    public boolean debit(int pennies) {
       this.balance -= pennies;
       return true;
    }
     
    public void applyInterest() {
       this.balance += (this.interestRate * this.balance);
    }
     
    public String accountInfo() {
       return "TestAccount with Balance = " + String.format("$%.2f\n", (this.balance / 100.0));
    }
 }
 