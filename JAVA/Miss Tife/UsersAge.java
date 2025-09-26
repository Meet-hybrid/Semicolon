import java.util.Scanner;
public class UsersAge {
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter user's name: ");
	String nameOne = input.nextLine();
	System.out.print("State " + nameOne + "'s age: ");
	int ageOne = input.nextInt();

	System.out.print("Enter user's name: ");
	String nameTwo = input.next();
	System.out.print("State " + nameTwo + "'s age: ");
	int ageTwo = input.nextInt();

	System.out.print("Enter user's name: ");
	String nameThree = input.next();
	System.out.print("State " + nameThree + "'s age: ");
	int ageThree = input.nextInt();

	int oldest = ageOne;
 

	if(ageTwo > oldest ){
	oldest = ageTwo;
	}
	
	if(ageThree > oldest ){
	oldest = ageThree;
	}

	int youngest = ageOne;
	

	if(ageTwo < youngest){
	youngest = ageTwo;
	}
	
	if(ageThree < youngest){
	youngest = ageThree;
	}

	System.out.println("Youngest is " + youngest);
	System.out.println("Oldest is " + oldest);
	
    }
}