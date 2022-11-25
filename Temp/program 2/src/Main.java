import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// constant Variable(dose not change)
		final double TAX_RATE = 0.13;
		
		//Variable declaration
		Scanner sc = new Scanner(System.in);
		double usbdevice = 0;
		double keyboard = 0;
		double computermouse = 0;
		
		
		System.out.println("Enter Number of Usb Storage device:");
		usbdevice = sc.nextInt();
		
		System.out.println("Enter Number of Keyboard:");
		keyboard = sc.nextInt();
		
		System.out.println("Enter Number of Computer mouse:");
		computermouse = sc.nextInt();
		
		//processing
		double usb = usbdevice * 19.99 ;
		double key = keyboard *49.99;
		double mouse = computermouse * 25.99;
		
		double tax = (usb + key + mouse)* TAX_RATE;
		double total = usb + key + mouse + tax;
		// output
		System.out.println("Tax : $" + tax );
		System.out.println("Total Cost : $" + total );

	}
}