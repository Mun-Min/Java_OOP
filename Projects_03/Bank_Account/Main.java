public class Main {
    public static void main(String[] args) {
        TestAccount testAccount = new TestAccount();
        testAccount.setAccountID("1234-5678-9012-3456");
        testAccount.setInterestRate(0.02);
        testAccount.credit(1000);
        testAccount.debit(500);
        testAccount.applyInterest();
        System.out.println("\n" + testAccount.accountInfo());
    }
}
