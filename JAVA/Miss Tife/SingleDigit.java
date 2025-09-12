/* DISPLAY Enter a single digit (0–9)
input digit

if digit = 0 then
    output "zero"
check if digit = 1 then
    output "one"
check if digit = 2 then
    output "two"
check if digit = 3 then 
    output "three"
check if digit = 4 then
    output "four"
check if digit = 5 then
    output "five"
check if digit = 6 then
    output "six"
check if digit = 7 then
    output "seven"
check if digit = 8 then
    output "eight"
check if digit = 9 then
    output "nine"
if not
    output "invalid" */

import java.util.Scanner;
public class SingleDigit {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enter a single digit (0-9) ");
	int digit = input.nextInt();

	if (digit == 0 ) System.out.println("Zero");
	else if (digit == 1 ) System.out.println("One");
	else if (digit == 2 ) System.out.println("Two");
	else if (digit == 3 ) System.out.println("Three");
	else if (digit == 4 ) System.out.println("Four");
	else if (digit == 5 ) System.out.println("Five");
	else if (digit == 6 ) System.out.println("Six");
	else if (digit == 7 ) System.out.println("Seven");
	else if (digit == 8 ) System.out.println("Eight");
	else if (digit == 9 ) System.out.println("Nine");
	else System.out.print("Invalid ");
    }
}