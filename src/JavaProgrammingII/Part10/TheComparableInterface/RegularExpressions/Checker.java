package JavaProgrammingII.Part10.TheComparableInterface.RegularExpressions;

/*
Day of week
Use regular expressions to create the method public boolean isDayOfWeek(String string), which returns true if the
parameter string is an abbreviation of a day of the week (mon, tue, wed, thu, fri, sat, sun)
 */

public class Checker {
    public boolean isDayOfWeek(String string) {
        //return string.matches("^(mon|t(ue|hu)|wed|fri|s(at|un))");
        String pattern = "^(mon|t(ue|hu)|wed|fri|s(at|un))";
        if (string.matches(pattern)) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }
}
