package lesson8.AbstractClass.Ass2;

import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        // Create a SavingsAccount and a CheckingAccount
        BankAccount savingsAccount = new SavingAccount();
        BankAccount checkingAccount = new CheckingAccount();

        // Deposit funds into each account
        savingsAccount.deposit(5000.0);
        checkingAccount.deposit(10000.0);

        // Perform some transactions
        savingsAccount.withdraw(500.0);
        checkingAccount.transfer(savingsAccount, 1000.0);

        // Display balances
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

        // Display transaction history for each account
        System.out.println("Savings Account Transaction History:");
        List<String> savingsTransactions = savingsAccount.getTransactionHistory();
        for (String transaction : savingsTransactions) {
            System.out.println(transaction);
        }

        System.out.println("Checking Account Transaction History:");
        List<String> checkingTransactions = checkingAccount.getTransactionHistory();
        for (String transaction : checkingTransactions) {
            System.out.println(transaction);
        }

    }
}
