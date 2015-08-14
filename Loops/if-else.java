import java.util.*;

class Loop {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Lets Loop IF-ELSE");
		System.out.println("Enter any number");

		num = sc.nextInt();

		/*************************************************************************************************************
		 If-Else Loop
		 In these kind of loops  user usually provides some cases for which the program checks for, whenever the condition
		 is specified, the piece of code under that condition is executed, READ MORE ABOUT LOOPS IS THE GUIDE
		 **************************************************************************************************************/
		
		if(num <=1) {
			System.out.println("Can't you enter a bigger value than that?????");
		}

		else if(num <=10) {
			System.out.println("Your number lies between 1-10");
		}

		else {
			System.out.println("Your number is greater than 10");
		}

	}
}
