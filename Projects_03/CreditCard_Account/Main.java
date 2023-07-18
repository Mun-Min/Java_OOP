public class Main {
    public static void main(String[] args) {

        // Creating a CreditcardAccount object
        CreditcardAccount creditcardAccount = new CreditcardAccount();

        // Setting account-specific details for the CreditcardAccount object
        creditcardAccount.setAccountID("9999-0000-1111-2222"); // Setting the unique account ID
        creditcardAccount.setInterestRate(0.015); // Setting the interest rate (as a decimal, 1.5% in this case)
        creditcardAccount.setLimit(1000000); // Setting the credit limit in cents (e.g., $10,000.00)

        // Performing some transactions on the credit card account
        creditcardAccount.credit(5000); // Crediting $50.00 to the account balance
        creditcardAccount.debit(2000); // Debiting $20.00 from the account balance

        // Applying interest to the account balance (if applicable)
        creditcardAccount.applyInterest();

        // Printing account information
        System.out.println("\n" + creditcardAccount.accountInfo());
    }
}
