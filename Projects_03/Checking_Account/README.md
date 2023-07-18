# CheckingAccount Java Class

## Required Skills Inventory
To complete this task, you should be familiar with the following concepts and skills:
- Java programming language

- Object-oriented programming (OOP) concepts
- Implementing inheritance in Java
- Overriding methods in subclasses
- Understanding UML Class Diagrams and translating them to Java code

## Problem Description and Given Info
You are required to create a public class named `CheckingAccount` in Java, which inherits (extends) the `BankAccount` class. The `CheckingAccount` class has specific fields and methods as described below, and it overrides and implements some of the abstract methods defined in the `BankAccount` base class.

### CheckingAccount Inherits BankAccount Class Diagram

<p align="center">
  <img src="./Images/CheckingAccountUML.png" alt="UML Class Diagram: CheckingAccount Inherits BankAccount">
</p>

### Structure of the Fields
As described by the UML Class Diagram, your `CheckingAccount` class must have the following field:
```java
private int overdraftFee = 0;
```

### Structure of the Methods
As described by the UML Class Diagram, your `CheckingAccount` class must have the following methods:
```java
public boolean debit(int amount);
public void setFee(int fee);
public int getFee();
public void applyInterest();
public String accountInfo();
```

### Behavior of the Methods
1. The `debit` method should subtract the `amount` argument from the balance. The debit method should always return `true`.

2. The `setFee` method should store the argument amount in the `overdraftFee` field.
3. The `getFee` method should return the value stored in the `overdraftFee` field.
4. The `applyInterest` method should compute the interest amount and add this amount to the balance but only if the balance is greater than 0.
5. When applying interest, the interest amount is calculated by multiplying the balance by the interest rate (e.g., if the interest rate is 0.02, the interest amount is `balance * 0.02`).
6. When applying interest, the interest amount is always added to the balance, and any fractional part will be rounded down (i.e., truncated).
7. Interest will not be applied to any Savings or Checking account with a balance of zero or less.
8. The `accountInfo` method will return a string formatted exactly like this:
```
Type of Account : Checking
Account ID      : 1111-2222-3333-4444
Current Balance : $123.45
Interest rate   : 1.50%
Overdraft Fee   : $20.00
```

### Additional Information
- All bank accounts use balance, credit, and debit amounts, and fees stored and passed as a number of pennies (int).

- All debit amounts will be subtracted from the balance, and all credit amounts will be added to the balance.
- All bank accounts have a non-negative interest rate (0.02 would be a 2% interest rate).
- When applying interest, the interest amount is calculated by multiplying the balance by the interest rate.
- When applying interest, the interest amount is always added to the balance, and any fractional part will be rounded down.
- Interest will not be applied to any Savings or Checking account with a balance of zero or less.
- Debit methods will return false if the transaction cannot be made because of insufficient balance or insufficient credit limit. Otherwise, they will return true.
- The credit method in the `BankAccount` base class will always return `true`.
- A `CheckingAccount` can have a negative balance.
- The `debit` method for the `CheckingAccount` will always return `true`.
- Any `CheckingAccount` debit that ends with a negative balance will incur an `overdraftFee` (i.e., the `overdraftFee` amount will be subtracted from the balance). A `CheckingAccount` debit will always succeed.
- Interest will not be applied to a `CheckingAccount` with a negative balance.

## Getting Started
1. Create a new Java file named `CheckingAccount.java`.

2. Define the `CheckingAccount` class that extends the `BankAccount` class.
3. Implement the abstract methods (`debit`, `applyInterest`, and `accountInfo`) in the `CheckingAccount` class, overriding the respective methods from the `BankAccount` class.
4. Implement the `setFee` and `getFee` methods for the `CheckingAccount` class.
5. Test your `CheckingAccount` class by using the provided `TestAccount` and `Main` classes or by creating additional test cases.

## Example Usage
```java
// Sample usage of CheckingAccount
public class Main {
    public static void main(String[] args) {
        // Example code to create and use a CheckingAccount
        // (This is just a sample and not a comprehensive test)

        // Creating a CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("1111-2222-3333-4444");
        checkingAccount.setInterestRate(0.015); // Set a 1.5% interest rate
        checkingAccount.setFee(2000); // Set an overdraft fee of 2000 pennies (i.e., $20)

        // Credit 1000 pennies (i.e., $10)
        checkingAccount.credit(1000);
        // Debit 1500 pennies (i.e., $15) - This will succeed but incur the overdraft fee
        boolean debitSuccess = checkingAccount.debit(1500);
        System.out.println("Debit success: " + debitSuccess);
        System.out.println(checkingAccount.accountInfo());

        // Attempt to apply interest to a checking account with a negative balance
        checkingAccount.applyInterest();
        System.out.println("Current Balance: " + checkingAccount.getBalance());
    }
}
```

## Notes
- The provided example usage is for demonstration purposes only and might not cover all possible scenarios. Consider writing more comprehensive tests to validate the correctness of your `CheckingAccount` class.

- Be sure to handle edge cases, such as applying interest to a zero or negative balance or checking for overdraft fees, appropriately in your implementations.
- Comment your code adequately, explaining your thought process and any assumptions you make during implementation.

## Solution 

To see the code solution, please check the following file:

* [Main.java](/Projects_03/Checking_Account/Main.java)

* [BankAccount.java](/Projects_03/Checking_Account/BankAccount.java)
* [Checking_Account.java](/Projects_03/Checking_Account/CheckingAccount.java)


---