package Unit3Everything;
import java.util.Scanner;

public class CandSandP {

	private static double power;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int Value = 0;
		double num;
		power = 0;
		double t = 0; 
		double b = 0;
		//Output
		while (Value !=4) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Menu");
			System.out.println("1. Find the value of a number squared");
			System.out.println("2. Find the value of a number cubed");
			System.out.println("3. Find the value of a number, to any power");
			System.out.println("4. Exit program");
			System.out.println("Enter Selection");
			Value = sc.nextInt();
			
			if (Value==1)
			{
				System.out.print("Enter a number to square: ");
				num=sc.nextDouble();
				double square = num * num;
				{  
					System.out.println("Square of "+ num + " is: "+ square);
				}
			}	
			
			else if (Value == 2)
			{
				System.out.print("Enter a number to cube: ");
				num=sc.nextDouble();
				double Cube= num * num * num;
				{  
					System.out.println("Cupe of "+ num + " is: "+ Cube);
				}
			}
			
			else if (Value == 3)
			{
			System.out.print("Enter a number: ");
			t=sc.nextDouble();
			System.out.print("Enter power: ");
			b=sc.nextDouble();
			double exponent = 1;
			for (int i = 1; i<=exponent; i++) t = t*b;
			System.out.println( "answer is: "+ t);
		}	
				
			else 
				{
				System.exit(0);
				}
				
			
		}
	}
}
	


