package bankingSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(5000);
        System.out.println("initial amount in CurrentAccount is : " + savings.getBalance());
        savings.deposit(1000);
        savings.withdraw(2000);
        System.out.println("Savings Balance: ₹" + savings.getBalance());
        System.out.println("...............................................");
        BankAccount current = new CurrentAccount(10000);
        System.out.println("initial amount in CurrentAccount is : " + current.getBalance());
        current.deposit(3000);
        current.withdraw(12000);
        System.out.println("Current Balance: ₹" + current.getBalance());
    }
}
