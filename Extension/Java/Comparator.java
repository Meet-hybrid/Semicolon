import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int numberOne = input.nextInt();

       
        System.out.print("Enter the second number: ");
        int numberTwo = input.nextInt();

        
        if (number1 == number2) {
            System.out.println("0");  
        } else if (number1 > number2) {
            System.out.println("1");  
        } else {
            System.out.println("-1");  
        }
    }
}