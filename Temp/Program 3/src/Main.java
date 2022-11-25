import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// constant Variable(dose not change)
		final double PI = 3.14;
		
	    //Variable declaration
	    Scanner sc = new Scanner(System.in);
	    double r = 0;
	    double area = 0;
	    //getting radius
	    System.out.println("Enter circle radius: ");
	    r = sc.nextInt();
	    
	    
	    //processing
	    area = PI * r * r;
	    
	    // output
	    System.out.println("Area of the circle = " + area);
	}
}