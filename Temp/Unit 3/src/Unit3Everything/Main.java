package Unit3Everything;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
	        // declaration of variables
	        int [ ] numbers = new int [20];
	        int total = 0;
	        //input
	        System.out.println("Enter ten integers and they will be added together:");
	        for (int i = 0; i <= 19; i = i + 1)
	        {
	           numbers[i] = sc.nextInt();
	        }
	        
	        //Calculations
	        for (int i = 0; i <= 19; i = i + 1)
	        {
	             total = total + numbers[i];
	        }
	        //output
	        System.out.println("The sum of those numbers is:");
	        System.out.println(total);
	}

}
