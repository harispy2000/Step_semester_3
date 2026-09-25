package week_5.encapsulation;

class FeeAccount {

    private double balance;

    FeeAccount(double openingBalance) {

        if (openingBalance < 0) {
            balance = 0;
        } else {
            balance = openingBalance;
        }
    }

    void pay(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class FeeAccountDemo {

    public static void main(String[] args) {

        FeeAccount account =
            new FeeAccount(50000);

        account.pay(10000);

        System.out.println(
            "Remaining fee balance: Rs " +
            account.getBalance()
        );
    }
}