public class Main {
    public static void main(String[] args) {
        // Create an instance of TestAccount, a derived class of BankAccount
        TestAccount testAccount = new TestAccount();
        
        // Set account ID and interest rate for the test account
        testAccount.setAccountID("1234-5678-9012-3456");
        testAccount.setInterestRate(0.02);
        
        // Credit 1000 pennies (i.e., $10.00) to the test account
        testAccount.credit(1000);
        
        // Debit 500 pennies (i.e., $5.00) from the test account
        testAccount.debit(500);
        
        // Apply interest to the test account based on the interest rate
        testAccount.applyInterest();
        
        // Display the account information
        System.out.println("\n" + testAccount.accountInfo());
    }
}
