package JavaProgrammingI.Part5._03_ObjectAndReferences.CardPayments;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment - 2.5 >= 0) {
            this.money += 2.5;
            this.affordableMeals++;
            return payment - 2.5;
        }
        return payment;

    }

    public double eatHeartily(double payment) {
        if (payment - 4.3 >= 0) {
            this.money += 4.3;
            this.heartyMeals++;
            return payment - 4.3;
        }
        return payment;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
