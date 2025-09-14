/*	⦁	prompt user to enter a balance and store as balance.
	⦁	check if balance is less than 100 and print low. if not,
	⦁	check if balance is less than or equal to 1000 and print medium. if not 
	⦁	print high if balance is above 1000 */


import java.util.Scanner;
public class BalanceCheck {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter account balance: ");
	double balance = input.nextDouble();

	if (balance < 100) {
	System.out.println("Low");
	}
	else if (balance <= 1000) {
	System.out.println("Medium");
	}
	else {
	System.out.println("High");
	}
  }
}
