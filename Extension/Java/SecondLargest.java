import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number = input.nextInt();

        int largest = number;
        int secondLargest = number;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } 
	else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        System.out.println("Second largest is " + secondLargest + " and largest is " + largest);
    }
}