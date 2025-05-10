package bankingSystem;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited ₹" + amount + " to Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew ₹" + amount + " from Current Account.");
        } else {
            System.out.println("Insufficient balance in Current Account.");
        }
    }
}
