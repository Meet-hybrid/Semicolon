/*	⦁	prompt user to enter a number and store the number
	⦁	if the number is divisible by 2 and remainder is equal to zero print even number. if not,
	⦁	print odd number */

import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if (number % 2 == 0 ) {
	System.out.println("Even number");
	}
	else {
	System.out.println("Odd number");
	}

    }
}
