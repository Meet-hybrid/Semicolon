/* Psuedo code
Ask the user to enter a score
input score

If the score is 90 or more
           Show "A"
if not, if the score is 80 or more
           Show "B"
if not, if the score is 70 or more
           Show "C"
if not, if the score is 60 or more
           Show "D"
if not (if score is less than 60)
           Show "F" */




import java.util.Scanner;
public class NumericalScore {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.print("Enter a score: ");
	int score = input.nextInt();
	
	if(score >= 90){ 
	System.out.println("A");
	}
	else if(score >= 80  && score <= 89){ 
		System.out.println("B");
	}
	else if(score >= 70 && score <= 79){
	 System.out.println("C");
	}
	else if(score >= 60 && score <= 69) 
	{System.out.println("D");
	
	}
	else if(score <60) System.out.println("F");
	
    }
}
