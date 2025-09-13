/*	⦁	prompt your user to input age
	⦁	store the age 
	⦁	place a condition and print categories */



import java.util.Scanner;
public class userAge {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter your age: ");
	int age = input.nextInt();

	if (age >= 0 && age <= 12){
	System.out.println("Child. ");
	}
	else if (age >= 13 && age <= 19) {
	System.out.println("Teen. ");
	}
	else if (age >= 20 && age <= 59) {
	System.out.println("Adult. ");
	}
	else if (age >= 60) {
	System.out.print("Senior. ");
	}
	else  {
	System.out.print("Invalid. ");
	}
	
	
    }
}