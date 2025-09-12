import java.util.Scanner;
public class AssistantApp {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter your name: ");
	String name = input.nextLine();

	System.out.print("Enter your age: ");
	int age = input.nextInt();

	System.out.print("Mood (happy, sad, excited, tired): ");
	String mood = input.next();

	if (age < 13) System.out.println("You are a young explorer!: ");
	else if (age <= 19) System.out.println("Teen life is fun, enjoy it!: ");
	else if (age <= 59) System.out.println("Aulting can be challenging, stay strong!: ");
	else System.out.println("Wisdom looks good on you!: ");

	if (mood.equals("happy"))System.out.println("Keep smiling!");
	if (mood.equals("sad"))System.out.println("Take a short walk outside and get some fresh air.");
	if (mood.equals("excited"))System.out.println("Share your excitement by helping someone!");
	if (mood.equals("tired"))System.out.println("Have a short nap or rest to recharge.");
	
	int secret = 9;
	System.out.print(" Guess number (1-10): ");
	int guess = input.nextInt();
	if (guess == secret) System.out.println("Wow! You guessed it!: ");
	else System.out.print("Try again next time! secret was " + secret);
	
	
     }
}