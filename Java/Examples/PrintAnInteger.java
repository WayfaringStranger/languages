import java.util.Scanner;

class PrintAnInteger {

	public static void main(String[] args) {

		// Creates a reader instance which takes
		// input from standard input - keyboard
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");

		// nextInt() reads the next integer form keyboard
		int number = scan.nextInt();

		System.out.println("You entered " + number);
	}
}
