package JavaProgrammingII.Part8._02_HashMap.SameDate;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
        && this.month < other.month) {
            return true;
        }

        return this.year == other.year
                && this.month == other.month
                && this.day < other.day;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month
                && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    @Override
    public boolean equals(Object comparedObject) {
        // variables equal if they located at the same place
        if (this == comparedObject) {
            return true;
        }

        // if passed object instance of SimpleDate, they are equal
        if (!(comparedObject instanceof SimpleDate comparedDate)) {
            return false;
        }

        // if instance variables are the same, objects are equal
        return this.year == comparedDate.year
                && this.month == comparedDate.month
                && this.day == comparedDate.day;
    }
}
