package forLoop2;

import java.util.Scanner;



public class ForLoop {

	public static void main(String[] args) {
		
		//variable Declaration
		Scanner sc = new Scanner(System.in);
		int numRepeats = 0;
		
		System.out.println("Enter number of times to repeate code : ");
		numRepeats = sc.nextInt();
		
		for (int i=0; i<numRepeats; i++) {
			System.out.println("Hello: " +i);
		}
	}

}
