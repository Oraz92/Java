package JavaProgrammingI.Part4._01_IntorductionToOOP.Account;

// Just training OOP with example
public class Account {
    private double balance;
    private String balanceHolderName;

    public Account(String balanceHolder, double balance) {
        this.balance = balance;
        this.balanceHolderName = balanceHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        if (this.balance - money >= 0) {
            this.balance -= money;
        } else {
            System.out.println("Not enough money!");
        }
    }

    @Override
    public String toString() {
        return this.balanceHolderName + " has deposit " + this.getBalance();
    }

    public static void main(String[] args) {
        Account orazAccount = new Account("Oraz", 500);
        Account amirAccount = new Account("Amir", 1000);

        System.out.println("Initial State:");
        System.out.println(orazAccount);
        System.out.println(amirAccount);

        orazAccount.withdraw(50);
        orazAccount.deposit(500);
        System.out.println(orazAccount);

    }
}
