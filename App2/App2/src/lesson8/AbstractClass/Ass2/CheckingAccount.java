package lesson8.AbstractClass.Ass2;

import java.util.ArrayList;
import java.util.List;

public class CheckingAccount implements BankAccount {
    private double balance;
    private List<String> transactionHistory;

    public CheckingAccount() {
        balance = 0.0;
        transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposit: +" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrawal: -" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(BankAccount destination, double amount) {
        if (balance >= amount) {
            balance -= amount;
            destination.deposit(amount);
            transactionHistory.add("Transfer: -" + amount);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}