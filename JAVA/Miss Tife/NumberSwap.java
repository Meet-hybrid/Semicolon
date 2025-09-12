import java.util.Scanner;
public class NumberSwap {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int a = input.nextInt();

	System.out.print("Enter a number: ");
	int b = input.nextInt();

	a = a * b; b = a / b; a = a / b;
	

	System.out.println("a: " + a);
	System.out.println("b: " + b);
    }
}