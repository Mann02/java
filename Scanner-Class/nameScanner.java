import java.util.Scanner;

class nameScanner {
	public static void main(String args[]) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();

		System.out.println("Welcome to JAVA tutorials " +name);
	}
}
