// Question number 4

import java.util.Scanner;

public class PositiveInt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a positive integer number: ");

		int num = input.nextInt();

		int i = 0;

		do {

			if (num % 2 == 0 && num != 0) {

				System.out.println(num);
			}

			num--;

		}

		while (num > i);

		input.close();

	}

}
