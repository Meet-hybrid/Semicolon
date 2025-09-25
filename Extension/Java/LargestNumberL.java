import java.util.Scanner;

public class LargestNumberL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number = input.nextInt();
        int largest = number;   

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}