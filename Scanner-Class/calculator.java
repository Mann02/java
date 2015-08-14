/* Explaining one last time here, this is our scanner package used for Scanner class */
import java.util.Scanner;

class Calculator {
	public static void main(String args[]) {
		int choice;    /* This will store the user choice */
		int a,b,result;   /* This will be used for user input and calculation */
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to JAVA calculator. \n Press 1 for Addition , 2 for Subtraction , 3 for multiplication and 4 for division");
		choice = sc.nextInt();

		
		/*************************************************************************************************************
		 Switch statement -
		 So basically switch statement is like whatever user inputs, it will go into that piece of code and will execute it 
		 and will not touch the rest of the code.
		 If the case below if user input 1, the switch case will jump to case 1: that is our addition section.
		 break' statements are used after every case to stop the program execution and limit it only to that case.
		 Let us suppose we forgot to add the break; statement and user want addition, the control will jump on addition, will add
		 two numbers, then it will show the output will come to the end and search for break; like "oh here is no break so i must
		 go on till i find a break" and it will jump to our case 2 that is subtraction and so on and as a result everything
		 will be shown as an output which we do not want so break is necessary when we use switch statements
		 **************************************************************************************************************/
		 
		switch(choice) {
			case 1:
			System.out.println("Enter the two numbers which you want to ADD");
			a = sc.nextInt();
			b = sc.nextInt();
			result = a+b;
			System.out.println("The Addition is : " +result);
			break;


			case 2:
			System.out.println("Enter the two numbers which you want to SUBTRACT");
			a = sc.nextInt();
			b = sc.nextInt();
			result = a-b;
			System.out.println("The Subtraction is : " +result);
			break;


			case 3:
			System.out.println("Enter the two numbers which you want to MULTIPLY");
			a = sc.nextInt();
			b = sc.nextInt();
			result = a*b;
			System.out.println("The Multiplication is : " +result);
			break;


			case 4:
			System.out.println("Enter the two numbers which you want to DIVIDE");
			a = sc.nextInt();
			b = sc.nextInt();
			result = a/b;
			System.out.println("The Division is : " +result);
			break;

			default:
			System.out.println("INVALID CHOICE");
			break;



		}
	}
}
