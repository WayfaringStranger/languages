import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		boolean isVowel = false;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = scan.next().charAt(0);
		scan.close();

		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				isVowel = true;
		}
		if (isVowel == true)
			System.out.println(ch + " is a Vowel.");
		else {
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.println(ch + " is a Consonant.");
			else
				System.out.println(ch + " is not a alphabet.");
		}
	}
}

