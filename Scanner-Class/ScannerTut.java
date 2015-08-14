
import java.util.Scanner;  /* Our util package */ 
public class ScannerTut {   /* Our class named Scanner Tut */
	public static void main(String args[]) {   /* OUr main function */
		int a,b,result;  /* three variables for storing user input and result */ 
		
		Scanner obj = new Scanner(System.in);   /* Creating the Scanner object. Read readme.md for more info */
		System.out.println("Enter first number");  /* Display message */
		a = obj.nextInt();  /* storing user input in a variable */
		
		System.out.println("Enter second number");  /* Display message */
		b = obj.nextInt();  /* Storing user inout in b variable */
		
		result = a+b;  /* calculating and storing result in result variable */
		
		System.out.println("The Result is : " +result);  /*Displaying result */
	}

}
