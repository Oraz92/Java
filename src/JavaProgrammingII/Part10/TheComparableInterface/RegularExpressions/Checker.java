package JavaProgrammingII.Part10.TheComparableInterface.RegularExpressions;

/*
1. Day of week
Use regular expressions to create the method public boolean isDayOfWeek(String string), which returns true if the
parameter string is an abbreviation of a day of the week (mon, tue, wed, thu, fri, sat, sun)

2. For simplicity's sake, in this exercises the letters that are considered vowels are: a, e, i, o, and u.

3. use the 24-hour clock. So the acceptable values are between 00:00:00 and 23:59:59.
 */

public class Checker {
    public boolean isDayOfWeek(String string) {
        return string.matches("^(mon|t(ue|hu)|wed|fri|s(at|un))");
    }

    public boolean allVowels(String string) {
        return string.matches("^[aeiou]*");
    }

    public boolean timeOFDay(String string) {
        return string.matches("([0-1]?[0-9]|2[0-3]):([0-5]?[0-9]):([0-5]?[0-9])");
    }
}