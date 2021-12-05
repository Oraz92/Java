package JavaProgrammingI.Part4._01_IntorductionToOOP.PaymentCard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        this.balance -= 2.60;
    }

    public void eatHeartily() {
        this.balance -= 4.60;
    }
}
