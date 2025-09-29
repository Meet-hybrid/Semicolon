import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] arg) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter any number: ");
	int number = input.nextInt();
	int factorial = 1;

	for (int b = 1; b <= number; b++) {
		factorial = factorial * b;
	}
	
	System.out.println("Factorial of" + number + " is: " + factorial);

    }
}
