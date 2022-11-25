import java.util.Scanner;


public class Main2 {

	public static void main(String[] args) {
		
	    //Variable declaration
	    Scanner sc = new Scanner(System.in);
	    String fname;
		String lname;
	    int age;
	   double height;
	  Boolean loveCS;

	  	fname= "Adnan";
		lname= "Almuqdad";
	    age= 17;
	    height= 188;
	    loveCS = true;
	  
	   System.out.println ("First Name: " + fname);
	   System.out.println ("Last Name: " + lname);
	   System.out.println ("Age: " + age);
	   System.out.println ("Height: " + height);
	   System.out.println ("Loves Computer Science? " + loveCS);
	}
}