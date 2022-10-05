package inherit;

public abstract class PersonalSavings extends PersonalAccount {

    // Constructor
    public PersonalSavings(String name, String address, String email, String phone) {
        super(name, address, email, phone);
    }
    // No need for deposit, it's in the grandparent class.
    // No need for withdraw, it's in the parent class.

    // Monthly fee = $20, but waived if currentBalance is > $3000
    public void addfee() {
        if(balance < 3000) {
            balance -= 20;
        }
    }

    // Interest = 3% monthly, compounded monthly
    public void addinterest() {
        balance = balance * 0.03;
    }

}
