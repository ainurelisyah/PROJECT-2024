package lesson8.AbstractClass.Ass12;

public class CheckingAccount implements BankAccount {

    private double balance;
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit){
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or exceeds overdraft limit.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
    
}
