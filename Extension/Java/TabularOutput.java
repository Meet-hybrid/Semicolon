public class TabularOutput {
    public static void main(String[] args) {
       
        System.out.println("N   N^2   N^3   N^4");

        
        for (int n = 1; n <= 5; n++) {
            int square = n * n;
            int cube = n * n * n;
            int power4 = n * n * n * n;

            
            System.out.println(n + "   " + square + "   " + cube + "   " + power4);
        }
    }
}