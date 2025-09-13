/*	⦁	prompt user to enter three numbers 
	⦁	store numbers as numberOne, numberTwo, numberThree
	⦁	Compare the three numbers and print out the highest number */


import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first number: ");
	int numberOne = input.nextInt();

	System.out.print("Enter the second number: ");
	int numberTwo = input.nextInt();

	System.out.print("Enter the third number: ");
	int numberThree = input.nextInt();

	int largest = numberOne;

	if (numberTwo > largest) largest = numberTwo;
	if (numberThree > largest) largest = numberThree;

	System.out.print("Largest is " + largest);
     }
}



