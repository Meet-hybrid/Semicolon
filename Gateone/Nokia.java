import java.util.Scanner;
public class Nokia {
    public static void main(String[] arg) {
	Scanner inputCollector = new Scanner(System.in);
	String nokiaMenu = """

	List of menu functions:
	1 -> Phone book
	2 -> Messages
	3 -> Chat
	4 -> Call register
	5 -> Tones
	6 -> Settings 
	7 -> Call divert
	8 -> Games
	9 -> Calculator
	10 -> Reminders
	11 -> Clock
	12 -> Profiles
	13 -> Sim services
		""";

		String PhoneBook = """
		  
			1. Search
			2. Service Nos. 1
			3. Add name
			4. Erase
			5. Edit
			6. Assign tone
			7. Send b’card
			8. Options
			9. Speed dials
			10. Voice tags


			""";

	System.out.println(nokiaMenu);
	System.out.print("Enter your choice from 1 - 13: ");
	int userInput = inputCollector.nextInt();

	switch (userInput){
		case 1->{System.out.println(PhoneBook);
			System.out.print("Enter PhoneBook choice: ");
			int PhoneBookinput = inputCollector.nextInt();

	
	
	switch (PhoneBookinput){
		 case 1->System.out.println("Search");
		 case 2->System.out.println("Service Nos");
       		 case 3->System.out.println("Add name");
		 case 4->System.out.println("Erase");
		 case 5->System.out.println("Edit");
		 case 6->System.out.println("Assign tone");
		 case 7->System.out.println("Send b’card");
		 case 8->{System.out.println("Options");
			  System.out.println(" 1 -> Type of view");
			  System.out.println(" 2 -> Memory status");
			  System.out.print("Enter Options choice (1-2): ");
			  int optionChoice = inputCollector.nextInt();
			             switch (optionChoice) {
                            case 1 -> System.out.println("Type of view");
			    case 2 -> System.out.println("Memory status");
			}
			  
			 
		}
		 case 9->System.out.println("Speed dials");
		 case 10->System.out.println("Voice tags");
		   }
		}
		

		
		case 2 -> {
		 String Messages = """
		Messages:
	1. Write messages
	2. Inbox
	3. Outbox
	4. Picture messages
	5. Templates
	6. Smileys
	7. Message settings
	8. Info service
	9. Voice mailbox number
	10. Service command editor
			"""; 
		System.out.println(Messages);
                System.out.print("Enter Messages choice (1-10): ");
                int messageChoice = inputCollector.nextInt();

                switch (messageChoice) {
                    case 1 -> System.out.println(" Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {System.out.println("message settings:");
				String messagesetting = """
				1. Set 1
		           	2. Common
		""";
		System.out.println(messagesetting);
		System.out.println("Enter 1 or 2");
		int msgset = inputCollector.nextInt();

                switch (msgset) {

                       
                            case 1 -> {
                                System.out.println("Set 1:");
                                System.out.println(" 1: Message centre number");
                                System.out.println(" 2: Messages sent as");
                                System.out.println(" 3: Message validity");
                                System.out.print("Enter Set 1 choice (1-3): ");
                                int s1 = inputCollector.nextInt();
                                switch (s1) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Messages sent as");
                                    case 3 -> System.out.println("Message validity");
                                   
                                }
                              }
                            case 2 -> {
                                System.out.println("Common:");
                                System.out.println(" 1: Delivery reports");
                                System.out.println(" 2: Reply via same centre");
                                System.out.println(" 3: Character support");
                                System.out.print("Enter Common choice (1-3): ");
                                int c = inputCollector.nextInt();
                                switch (c) {
                                    case 1 -> System.out.println("YDelivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                    
                         }
                        }
                           
                      }
                    }
                    case 8 -> System.out.println("Info service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
			
		
	}
}
}
		
	
    }
}