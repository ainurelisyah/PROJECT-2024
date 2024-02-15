package lesson8.Ass2;

public class CheckingAccount implements BankAccount {

    private double balance;
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit){
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= - overdraftLimit){
            balance = balance - amount;
        } else {
            System.out.println("withdrawal exceeds overdraft limit in Checking Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    
}
