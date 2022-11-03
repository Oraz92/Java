import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Exam {
    /*
    static int B;
    static int H;
    static boolean flag = false;

    static {
        try {
            Scanner scanner = new Scanner(System.in);
            B = scanner.nextInt();
            H = scanner.nextInt();
            if (B > 0 && H > 0) {
                flag = true;
            } else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    } */

    public static void main(String[] args) {
        double payment = 12324.13;
        java.text.NumberFormat formatUS = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.US);
        String us=formatUS.format(payment);

        java.text.NumberFormat formatIndia = java.text.NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india=formatIndia.format(payment);

        java.text.NumberFormat formatChina = java.text.NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatChina.format(payment);

        java.text.NumberFormat formatFrance = java.text.NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatFrance.format(payment);
        //String us = NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payment).toString();
        //String india = NumberFormat.getCurrencyInstance(new Locale("India")).format(payment).toString();
        //String china = NumberFormat.getCurrencyInstance(new Locale("zh", "China")).format(payment).toString();
        //String france = NumberFormat.getCurrencyInstance(new Locale("fr", "France")).format(payment).toString();

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        //showCurrencyInfo(Locale.CHINA);


        //printNumbers(5);
        //printNumbersFromTo(12, 7);
        //exactPowerOfTwo(126);
        //System.out.println(sumOfDigitsOfNumber(333));
        //printDigitsOfNumberFromRightToLeft(179);
        //printDigitsOfNumberFromLeftToRight(179);
        //isDigitSimple(27, 3);
    }

    private static String getCurrencyInfo(Locale locale, double payment) {
        Currency currency = Currency.getInstance(locale);
        //System.out.println("Currency display name : " + currency.getDisplayName());
        //System.out.println("Currency display name (Locale) : " + currency.getDisplayName(locale));
        //System.out.println("Currency Code : " + currency.getCurrencyCode());
        //System.out.println("Currency Numeric Code : " + currency.getNumericCode());
        //System.out.println("Currency Symbol : " + currency.getSymbol());
        System.out.print(currency.getSymbol(locale));
        return "";
    }

    public static void printNumbers(int number) {
        if (number >= 1) {
            printNumbers(number - 1);
            System.out.println(number);
        }
    }

    public static void printNumbersFromTo(int a, int b) {
        if (a <= b) {
            System.out.println(a);
            if (a == b) {
                return;
            }
            printNumbersFromTo(a + 1, b);
        } else {
            System.out.println(a);
            printNumbersFromTo(a - 1, b);
        }
    }

    public static void exactPowerOfTwo(int number) {
        if (number < 2) {
            return;
        }
        if ((number % 2) != 0) {
            System.out.println("No");
            return;
        }
        exactPowerOfTwo(number / 2);
        if (number <= 2) {
            System.out.println("Yes");
        }
    }

    public static int sumOfDigitsOfNumber(int number) {
        if (number <= 0) {
            return 0;
        }
        return number % 10 + sumOfDigitsOfNumber(number / 10);
    }

    public static void printDigitsOfNumberFromRightToLeft(int number) {
        if (number <= 0) {
            return;
        }
        System.out.print(number % 10 + " ");
        printDigitsOfNumberFromRightToLeft(number / 10);
    }

    public static void printDigitsOfNumberFromLeftToRight(int number) {
        if (number <= 0) {
            return;
        }
        printDigitsOfNumberFromLeftToRight(number / 10);
        System.out.print(number % 10 + " ");
    }

    public static void isDigitSimple(int number, int lowest) {
        if (number == 2 || number == 3 || number == 5) {
            System.out.println("Yes");
            return;
        } else if (number % 2 == 0) {
            System.out.println("No");
            return;
        }
        if (lowest > number / 2) {
            return;
        }
        isDigitSimple(number, lowest + 1);
        if (number % lowest == 0) {
            System.out.println("No");
        } else if (lowest == 3) {
            System.out.println("Yes");
        }
    }
}