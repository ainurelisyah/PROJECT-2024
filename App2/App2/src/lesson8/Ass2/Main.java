package lesson8.Ass2;

public class Main {
    
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000, 0.05);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
    }
}
