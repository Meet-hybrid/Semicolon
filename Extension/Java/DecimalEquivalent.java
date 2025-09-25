import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int number = input.nextInt();

        int total = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            total = total * 2 + lastDigit; 
            number /= 10;                   
        }

        System.out.println("Decimal equivalent is: " + total);
    }
}