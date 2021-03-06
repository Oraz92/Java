package JavaProgrammingI.Part4._01_IntorductionToOOP.Account;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void advance() {
        // Checking days
        if (this.day < 30) {
            this.day = this.getDay() + 1;
        } else {
            this.day = 1;
            // Checking month
            if (this.month < 12) {
                this.month = this.getMonth() + 1;
            } else {
                this.month = 1;
                this.year = this.getYear() + 1;
            }
        }
    }

    public void advance(int howManyDays) {
        /*if (this.day + howManyDays < 30) {
            this.day = this.getDay() + howManyDays;
        } else {
            int i = 0;
            while (i < howManyDays) {
                advance();
                i++;
            }
        }*/
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate obj = new SimpleDate(this.getDay(), this.getMonth(), this.getYear());
        obj.advance(days);
        return obj;

    }


    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        return this.year == compared.year &&
                this.month == compared.month &&
                this.day < compared.day;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate
        if (!(compared instanceof SimpleDate comparedSimpleDate)) {
            return false;
        }

        // otherwise, the objects are not equal
        return this.day == comparedSimpleDate.day &&
                this.month == comparedSimpleDate.month &&
                this.year == comparedSimpleDate.year;
    }

    public String print(int value) {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }

    public String toString() {
        return print(this.day) + "." + print(this.month) + "." + print(this.year);
    }

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);
        date.advance(360);
        System.out.println(date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            week = week + 1;
        }
    }
}
