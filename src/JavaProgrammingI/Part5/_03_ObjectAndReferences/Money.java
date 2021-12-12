package JavaProgrammingI.Part5._03_ObjectAndReferences;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else {
            return this.euros == compared.euros && this.cents < compared.cents;
        }
    }

    public Money minus(Money decreaser) {
        String thisMoney = correctZeroRank(this);
        String decreaseMoney = correctZeroRank(decreaser);

        double difference = Double.parseDouble(thisMoney) - Double.parseDouble(decreaseMoney);
        if (difference <= 0) {
            return new Money(0, 0);
        } else {
            String str = "" + difference;
            StringBuilder strDot = new StringBuilder();
            int[] array = new int[2];
            int i = 0;
            int j = 0;
            boolean reachedDot = false;
            int counterOfCents = 0; // this variables has been added to for adding zero after tens of cent
            while (i < str.length()) {
                if (str.charAt(i) == '.') {
                    array[j] = Integer.parseInt(strDot.toString());
                    strDot = new StringBuilder();
                    j++;
                    i++;
                    reachedDot = true;
                    continue;
                }
                strDot.append(str.charAt(i));
                if (reachedDot) {
                    counterOfCents++;
                }
                i++;
            }
            if (counterOfCents < 2) {
                array[j] = Integer.parseInt(strDot.toString() + '0');
            } else {
                array[j] = Integer.parseInt(strDot.toString());
            }
            int euros = array[0];
            int cents = array[1];
            return new Money(euros, cents);
        }
    }

    public String correctZeroRank(Money money) {
        String str = money.euros() + ".";
        if (money.cents < 10) {
            str += "0" + money.cents;
            return str;
        } else {
            str += money.cents;
            return str;
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
        return this.euros + "." + zero + cents + "e.";
    }

    public static void main(String[] args) {
        /*Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        Money d = new Money(10, 0);
        Money e = new Money(3, 0);
        Money f = new Money(5, 0);

        System.out.println(d.lessThan(e));  // false
        System.out.println(e.lessThan(f));  // true*/

        Money a = new Money(10, 50);
        Money b = new Money(3, 0);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
