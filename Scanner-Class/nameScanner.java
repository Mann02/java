
/* The package for Scanner class */
import java.util.Scanner;

class nameScanner {
	public static void main(String args[]) {
		
		/* To input a string we need to declare a String variable and a name for variable */
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		
		/*Stores string value into our name variable */
		name = sc.nextLine();

		/* now predict the output? */
		System.out.println("Welcome to JAVA tutorials " +name);
	}
}
