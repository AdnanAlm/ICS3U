import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Variable declaration
		Scanner sc = new Scanner(System.in);
		int computer = 0, TonsOfWater = 0;

		// get number of computers
		System.out.println("Enter number of computer:");
		computer = sc.nextInt();

		// processing
		TonsOfWater = (int) (computer * 1.5);

		// output
		System.out.println("Tons of water used : " + TonsOfWater);

		}
		
		
}