import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// constant Variable(dose not change)
		final double TAX_RATE = 0.13;
		
		//Variable declaration
		Scanner sc = new Scanner(System.in);
		int length = 0, width = 0, area = 0;
		
		
		System.out.println("Enter length:");
		length = sc.nextInt();
		
		System.out.println("Enter width:");
		width = sc.nextInt();
		
		//processing
		area = length * width;
		// output
		System.out.println("Area is: " + area);

	}
}
