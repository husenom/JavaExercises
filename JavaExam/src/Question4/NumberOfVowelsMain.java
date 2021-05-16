package Question4;

import java.util.Scanner;

public class NumberOfVowelsMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your word: ");

		String word = input.nextLine();

		NumberOfVowels vowels = new NumberOfVowels(word);

		vowels.vowelCount();

		input.close();
	}

}
