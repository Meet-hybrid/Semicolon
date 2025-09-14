import java.util.Scanner;
public class temperatureChecker {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter temperature in Celsius: ");
	int temp = input.nextInt();


	if (temp < 0) {
	System.out.println("Freezing");
	}
	else if (temp <= 15) {
	System.out.println("Cold");
	}
	else if (temp <= 25) {
	System.out.println("Warm");
	}
	else {
	System.out.println("Hot");
	}

    }
}