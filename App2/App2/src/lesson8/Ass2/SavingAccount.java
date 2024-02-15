package lesson8.Ass2;

public class SavingAccount implements BankAccount {
    
    private double balance;
    private double interestRate;
    
    public SavingAccount(double initialBalance, double interestRate){
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount){
            balance = balance - amount;
        } else {
            System.out.println("Insufficienet funds in Saving Account");
        }
    }

    @Override
    public double getBalance() {
        return balance + (balance * interestRate);
    } 
    
}
