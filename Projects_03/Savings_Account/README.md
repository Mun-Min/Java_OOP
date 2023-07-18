# SavingsAccount Java Class

## Required Skills Inventory
To complete this task, you should be familiar with the following concepts and skills:
- Java programming language

- Object-oriented programming (OOP) concepts
- Implementing inheritance in Java
- Overriding methods in subclasses
- Understanding UML Class Diagrams and translating them to Java code

## Problem Description and Given Info
You are required to create a public class named `SavingsAccount` in Java, which inherits (extends) the `BankAccount` class. The `SavingsAccount` class has specific fields and methods as described below, and it overrides and implements the abstract methods defined in the `BankAccount` base class.

### SavingsAccount Inherits BankAccount Class Diagram

<p align="center">
  <img src="./Images/SavingsAccountUML.png" alt="UML Class Diagram: SavingsAccount Inherits BankAccount">
</p>

### Structure of the Fields
As described by the UML Class Diagram, your `SavingsAccount` class has no additional required fields.

### Structure of the Methods
As described by the UML Class Diagram, your `SavingsAccount` class must have the following methods:
```java
public boolean debit(int amount);
public void applyInterest();
public String accountInfo();
```

### Behavior of the Methods
1. The `debit` method should subtract the `amount` argument from the balance but only if the amount is not more than the balance. This method should return `true` if the amount was subtracted from the balance; otherwise, it should return `false`.

2. The `applyInterest` method should compute the interest amount and add this amount to the balance but only if the balance is greater than 0. The interest amount is calculated by multiplying the balance by the interest rate (e.g., if the interest rate is 0.02, the interest amount is `balance * 0.02`).
3. When applying interest, the interest amount is always added to the balance, and any fractional part will be rounded down (i.e., truncated).
4. Interest will not be applied to any Savings or Checking account with a balance of zero or less.
5. The `accountInfo` method will return a string formatted exactly like this:
```
Type of Account : Savings
Account ID      : 1111-2222-3333-4444
Current Balance : $123.45
Interest rate   : 1.50%
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

## Getting Started
1. Create a new Java file named `SavingsAccount.java`.

2. Define the `SavingsAccount` class that extends the `BankAccount` class.
3. Implement the abstract methods (`debit`, `applyInterest`, and `accountInfo`) in the `SavingsAccount` class, overriding the respective methods from the `BankAccount` class.
4. Test your `SavingsAccount` class by using the provided `TestAccount` and `Main` classes or by creating additional test cases.

## Example Usage
```java
// Sample usage of SavingsAccount
public class Main {
    public static void main(String[] args) {
        // Example code to create and use a SavingsAccount
        // (This is just a sample and not a comprehensive test)

        // Creating a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("1111-2222-3333-4444");
        savingsAccount.setInterestRate(0.015); // Set a 1.5% interest rate
        savingsAccount.credit(1000); // Credit 1000 pennies (i.e., $10)
        savingsAccount.applyInterest(); // Apply the interest rate
        System.out.println(savingsAccount.accountInfo());

        // Try to debit an amount larger than the balance
        boolean debitSuccess = savingsAccount.debit(1500); // Try to debit 1500 pennies (i.e., $15)
        System.out.println("Debit success: " + debitSuccess);
        System.out.println("Current Balance: " + savingsAccount.getBalance());
    }
}
```

## Notes
- The provided example usage is for demonstration purposes only and might not cover all possible scenarios. Consider writing more comprehensive tests to validate the correctness of your `SavingsAccount` class.

- Be sure to handle edge cases, such as applying interest to a zero or negative balance, or attempting to debit more than the balance, appropriately in your implementations.
- Comment your code adequately, explaining your thought process and any assumptions you make during implementation.

## Solution 

To see the code solution, please check the following file:

* [Main.java](/Projects_03/Savings_Account/Main.java)

* [BankAccount.java](/Projects_03/Savings_Account/BankAccount.java)
* [SavingsAccount.java](/Projects_03/Savings_Account/SavingsAccount.java)


---