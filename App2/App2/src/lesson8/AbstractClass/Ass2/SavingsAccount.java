package lesson8.AbstractClass.Ass2;

public class SavingsAccount implements BankAccount {

    private double balance;
    private double interestRate;
    
    //Constructor
public SavingsAccount(double initialBalance, double interestRate){
    this.balance = initialBalance;
    this.interestRate = interestRate;
}

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            calculateInterest();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount){
            balance -= amount;
            calculateInterest();
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    private void calculateInterest() {
        balance += balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }
    
}
