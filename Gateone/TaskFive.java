public class TaskFive {
    public static void main(String[] args) {
	int counter = 1;
	int four = 0;
	int eight = 0;
	while (counter <= 10) {
	if(counter % 4 == 0 )
	four += counter;
	if(four == 4)
	eight += counter;
	if(eight == 8)

	System.out.println(four + eight);
	
	counter++;
	}
	
   }
}