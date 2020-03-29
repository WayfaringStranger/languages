import java.util.Scanner;

public class MultiplicationOfNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number: ");
		double num1 = scan.nextInt();

		System.out.println("Enter second number: ");
		double num2 = scan.nextInt();

		scan.close();

		double result = num1 * num2;
		System.out.println("Result : " + result);
	}
}
