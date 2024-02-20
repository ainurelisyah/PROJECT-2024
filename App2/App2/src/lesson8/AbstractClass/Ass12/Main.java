package lesson8.AbstractClass.Ass12;

public class Main {
    public static void main(String[] args) {
        
        //Test SavingsAccount 
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
        System.out.println("Savings Account Initial Balance: " + savingsAccount.getBalance());

        savingsAccount.deposit(500.0);
        System.out.println("Savings Account Balance after Deposit: " + savingsAccount.getBalance());

        savingsAccount.withdraw(200.0);
        System.out.println("Saving Account Balance after Withdrawal: " + savingsAccount.getBalance());

        System.out.println();

        //Test CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount(1500.0, 500.0 );
        System.out.println("Checking Account Initial Balance: " + checkingAccount.getBalance());

        checkingAccount.deposit(200.0);
        System.out.println("Checking Account Balance after Deposit: " + checkingAccount.getBalance());

        checkingAccount.withdraw(800.0);
        System.out.println("Checking Account Balance after Withdrawal: " + checkingAccount.getBalance());
    }
}
