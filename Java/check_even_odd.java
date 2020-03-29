import java.util.Scanner;

class CheckEvenOdd {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter an integer number : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		if (num % 2 == 0)
			System.out.println("Your number is even.");
		else
			System.out.println("Your number is odd.");
	}
}

