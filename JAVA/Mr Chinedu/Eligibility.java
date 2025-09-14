/*	⦁	prompt user for attendance percent and store as attendance.
	⦁	prompt user to enter average score and store as score.
	⦁	check if attendance and are equal to or greater than 75 and print eligible and if not print not eligible. */


import java.util.Scanner;
public class Eligibility {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter attendance percentage: ");
	int attendance = input.nextInt();

	System.out.print("Enter average score: ");
	int score = input.nextInt();

	if (attendance >= 75 && score >= 75) {
	System.out.println("Eligible ");
	}
	else {
	System.out.println("Not Eligible ");
	}

   }
}