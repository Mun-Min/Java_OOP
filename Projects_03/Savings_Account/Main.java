public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount();
        
        // Set the account ID and interest rate
        savingsAccount.setAccountID("1111-2222-3333-4444");
        savingsAccount.setInterestRate(0.015); // 1.5%
        
        // Credit and debit some amounts
        savingsAccount.credit(1000);
        savingsAccount.debit(500);
        
        // Apply interest and display account information
        savingsAccount.applyInterest();
        System.out.println("\n" + savingsAccount.accountInfo());
    }
}
