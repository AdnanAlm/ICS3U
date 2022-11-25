import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		// constant Variable(dose not change)
		final double TAX_RATE = 0.15;
		
		//Variable declaration
		Scanner sc = new Scanner(System.in);
		int Money = 0; 	
		
		System.out.println("Enter Money Earned:");
		Money = sc.nextInt();
		System.out.println("Enter Money Earned:");
		Money = sc.nextInt();
		
		
		
		//processing
		double tax = Money * TAX_RATE;
		// output
		System.out.println("Your incme tax is: $" + tax);
		
	}
}