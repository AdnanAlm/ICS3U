package Unit3Everything;
import java.util.Scanner;

public class CreatingForLoops {

	public static void main(String[] args) {
		//Variable Declaration
		
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		
		//Output
		while (choice !=1000000) {
			System.out.println("--Cool Counting Program--");
			System.out.println(" ");
			System.out.println("Please Enter your choice");
			System.out.println("1. Count from 0 to 10 by 1");
			System.out.println("2. Count from 100 to 0 by 10");
			System.out.println("3.Count from 50 to 500 by 50");
			System.out.println("4.Count from 6000 to 1000 by 1000");
			System.out.println("5. Exit Program");
			System.out.println("Please eneter your choice");
			choice = sc.nextInt();
			System.out.println(" ");
			System.out.println("-----------------------------------------");
			
			if (choice==1)
			{
				System.out.println("You have chosen to count from 0 to 10 by 1");
				for (int i = 0; i<= 10; i = i + 1)
				{  
					System.out.println(i);
				}
			}	
			
			else if (choice == 2)
			{
				System.out.println("You have chosen to count from 100 to 0 by 10");
				for (int i = 100; i>= 10; i = i -10)
				{
					System.out.println(i);
				}
			}
			
			else if (choice == 3)
			{
				System.out.println("You have chosen to count from 50 to 500 by 50");
				for (int i = 50; i<= 500; i = i +50)
				{
					System.out.println(i);
				}
			}
			else if (choice == 4)
			{
				System.out.println("You have chosen to count from 6000 to 1000 by 1000");
				for (int i = 6000; i>= 1000; i = i -1000)
				{
					System.out.println(i);
				}
			}
			else 
				{
				System.exit(0);
				}
				
	}
		
	}
}


