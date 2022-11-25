import java.util.Scanner; //import to get user input

public class Mian {

	public static void main(String[] args) {
		
		//variable declaration
		int age = 0;
		Scanner SC = new Scanner(System.in);	
	
		
		//get user name 
		System.out.println("Enter Name: ");
		String name = SC.nextLine();
		//your age
		System.out.println("Enter your age: ");
		age = SC.nextInt();
		
		System.out.println("how much money do you have: ");
		double money = SC.nextDouble();
		
		// output
		System.out.println("Your name is: " + name);
		System.out.println("Your age is: " + age);
		System.out.println("you are worth: " + money);
		
	
	}
	
	

}
