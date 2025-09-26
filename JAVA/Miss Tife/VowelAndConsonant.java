import java.util.Scanner;
public class VowelAndConsonant {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter any character: ");
	char ch = input.next().charAt(0);

	if ("aeiouAEIOU".indexOf(ch) != -1) 
	System.out.println("Vowel");
	else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
	
	System.out.println("Consonant");
	
	else 
	System.out.println("Invalid");
	
    }
}

