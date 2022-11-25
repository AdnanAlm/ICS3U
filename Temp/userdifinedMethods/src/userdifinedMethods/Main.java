package userdifinedMethods;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	public static void helloWorld()  {
		
		System.out.println("Hello World!");
		System.out.println("Hello World!@@@@@@");
		
	}
	public static double addTwoNums(int n1, double n2) {
		return(n1+n2);
	}
	public static double addTwoNums(double n1, int n2) {
		return(n1+n2);
	}
	/*public static String tripleNum (int n) {

	int answer;
	answer =n * 3;
	return "foo";
	
	}
	*/
	
	public static void main(String[] args) {
		
		System.out.println(addTwoNums(32.2,13));
		
		
		
		
		
	/*  String foo;
	
		helloWorld();
		System.out.println(tripleNum(2));
	
		foo =tripleNum(3);
		System.out.println(foo);
}
	public static int tripleNum (int n) {

		int answer;
		answer =n * 3;
		return answer;
		
	}
	public static void main(String[] args) {
		
		int foo;
		
		helloWorld();
		System.out.println(tripleNum(2));
		
		foo =tripleNum(3);
		System.out.println(foo);
	}
		*/
	}
}


