package Unit3Everything;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		   
		Scanner sc = new Scanner (System.in);
	        
	        String [ ] friends = new String [5];
	        
	        System.out.println("Enter the names of ten friends:");
	        for (int i = 0; i <= 4; i = i + 1)
	        {
	            friends[i] = sc.nextLine();
	        }
	        
	        System.out.println("The second and third and fourth names listed were:");
	        System.out.println("second: " + friends[3]);
	        System.out.println("third: " + friends[4]);
	        System.out.println("fourth: " + friends[5]);
	}

}
