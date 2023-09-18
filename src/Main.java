import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your five-digit integer that you would like to convert to extended form: ");
        String num = s.nextLine();
        int converted = Integer.parseInt(num);
        int tenThousands = converted % 10;
        int thousands = (converted / 10) % 10;
        int hundreds = (converted / 100) % 10;
        int tens = (converted / 1000) % 10;
        int ones = (converted / 10000) % 10;
        thousands *= 10;
        hundreds *= 100;
        tens *= 1000;
        ones *= 10000;
        String plus = " + ";
        System.out.print("Here is your five-digit integer that had all digits incremented by 1: " + ones + plus + tens + plus + hundreds + plus + thousands + plus + tenThousands);
    }
}