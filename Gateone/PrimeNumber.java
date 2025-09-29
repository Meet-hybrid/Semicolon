import java.util.Scanner;
public class PrimeNumber {
    public static void mian(String[] arg) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter a positive number");
	int number = input.nextInt();
	int a = 0;

	for (int b = 1; b <= number; b++)
		if (number % 1 == 0)
		    a++;
		if (a == 0)
		System.out.println(number + "is a prime number");
		esle
		System.out.println(number + "is not a prime number");
    }
}
