/*

⦁	prompt user to enter an integer
⦁	store the integer variable called  "number"
⦁	create a variable as TempNumber equal zero
⦁	create a variable as count equal zero
⦁	add the "number" to TempNumber
⦁	increase count by one
⦁	and print out the result */


import java.util.Scanner;
public class SquareOfNumber {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	int tempNumber = 0;
	int count = 0;

	while (count < number || count > number) {             
	 tempNumber += number;
	count++;
	}
	
	System.out.print("Square is " + tempNumber);
	

	
	
	
    }
}

	