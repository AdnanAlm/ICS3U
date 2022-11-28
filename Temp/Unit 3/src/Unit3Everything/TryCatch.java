package Unit3Everything;
import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int myinteger = 0;
		String userinput="";
		boolean validEntry = false;
		
		while (validEntry == false){
		
			System.out.println("Enter Intger: ");
			userinput = sc.nextLine();
			
			try {
				myinteger = Integer.parseInt(userinput);
				validEntry = true;
			}
		
			
			
			catch(Exception e) {
		System.out.println("Invalid, Try again ...");
		System.out.println(e);
		}
		
		
	 }

    }
}
