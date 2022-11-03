import java.util.Scanner;

public class ArabicToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(intToRoman(number));
    }

    public static String intToRoman(int number) {
        StringBuilder result = new StringBuilder();
        String[] numbers = String.valueOf(number).split("");
        if (number > 0 && number < 4000) {
            switch (numbers.length) {
                case 1 -> {
                    result.append(getLetter(numbers[0]));
                }
                case 2 -> {
                    result.append(getLetter(numbers[0] + "0"));
                    result.append(getLetter(numbers[1]));
                }
                case 3 -> {
                    result.append(getLetter(numbers[0] + "00"));
                    result.append(getLetter(numbers[1] + "0"));
                    result.append(getLetter(numbers[2]));
                }
                case 4 -> {
                    result.append(getLetter(numbers[0] + "000"));
                    result.append(getLetter(numbers[1] + "00"));
                    result.append(getLetter(numbers[2] + "0"));
                    result.append(getLetter(numbers[3]));
                }
            }
        } else {
            System.out.println("Roman numeral can not be less than 0 and greater than 3999");
        }
        return result.toString();
    }

    public static String getLetter(String number) {
        String result = "";
        switch (number) {
            case "1" -> result += "I";
            case "2" -> result += "II";
            case "3" -> result += "III";
            case "4" -> result += "IV";
            case "5" -> result += "V";
            case "6" -> result += "VI";
            case "7" -> result += "VII";
            case "8" -> result += "VIII";
            case "9" -> result += "IX";
            case "10" -> result += "X";
            case "20" -> result += "XX";
            case "30" -> result += "XXX";
            case "40" -> result += "XL";
            case "50" -> result += "L";
            case "60" -> result += "LX";
            case "70" -> result += "LXX";
            case "80" -> result += "LXXX";
            case "90" -> result += "XC";
            case "100" -> result += "C";
            case "200" -> result += "CC";
            case "300" -> result += "CCC";
            case "400" -> result += "CD";
            case "500" -> result += "D";
            case "600" -> result += "DC";
            case "700" -> result += "DCC";
            case "800" -> result += "DCCC";
            case "900" -> result += "CM";
            case "1000" -> result += "M";
            case "2000" -> result += "MM";
            case "3000" -> result += "MMM";
        }
        return result;
    }
}
