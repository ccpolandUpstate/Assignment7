package inherit;

public abstract class BusinessChecking extends BusinessAccount {

    // Constructor
    public BusinessChecking(String name, String address, String email, String phone) {
        super(name, address, email, phone);
    }

    // Fee is withdraw amount is < $10,000
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            if(amount < 10000) {
                balance -= 10;
            }
            return true;
        }
        return false;
    }
    // Interest = no interest.
    public void addinterest() {
        balance = balance;
    }

    // Addfee is in the parent class

    // Deposit, in the BankAccount class, no fee.
}
