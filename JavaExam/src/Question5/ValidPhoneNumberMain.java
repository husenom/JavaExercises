package Question5;

import java.util.Scanner;

public class ValidPhoneNumberMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your phone number: ");

		long number = input.nextLong();

		ValidPhoneNumber userPhone = new ValidPhoneNumber(number);

		userPhone.isValid();

		input.close();
	}

}
