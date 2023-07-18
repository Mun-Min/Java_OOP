public class Main {
    public static void main(String[] args) {
        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount();

        // Set the account ID, interest rate, and overdraft fee
        checkingAccount.setAccountID("1111-2222-3333-4444");
        checkingAccount.setInterestRate(0.015); // 1.5%
        checkingAccount.setFee(2000); // $20.00

        // Credit and debit some amounts
        checkingAccount.credit(1000);
        checkingAccount.debit(1500);

        // Apply interest and display account information
        checkingAccount.applyInterest();
        System.out.println("\n" + checkingAccount.accountInfo());
    }
}