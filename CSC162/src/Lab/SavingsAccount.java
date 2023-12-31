package Lab;

public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
        
    }

    // Overriding the withdraw method in the Account class
    public void withdraw(double amount) {
        if (super.getBalance() - amount < 0) {
            System.out.println("You cannot withdraw!");
        } else {
            // super.balance -= amount
            super.setBalance(super.getBalance() - amount);
        }
    }
    
}