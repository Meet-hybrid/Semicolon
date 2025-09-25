import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.next();   

        int total = 0;

       
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            int digit = c - '0';  
            total = total * 2 + digit;
        }

        System.out.println("Decimal equivalent is: " + total);
    }
}