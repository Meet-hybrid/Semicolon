/*	⦁	prompt user to enter grade letter A-F and store
	⦁	compare if grade is between A-D and print "Pass". if not
	⦁	check if grade letter is F and print "fail" */


import java.util.Scanner;
public class LetterCheck {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter grade letter (A-F): ");
	String grade = input.nextLine();

	if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D")) {
	System.out.println("Pass");
	}
	else if (grade.equals("F")) {
	System.out.println("Fail");
	}
    }
}