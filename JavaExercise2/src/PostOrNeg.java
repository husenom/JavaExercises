// Question number 3

import java.util.Scanner;

public class PostOrNeg {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		
		int num = input.nextInt();
		
		if (num > 0) {
			System.out.println("You entered a positive number");
		}
		
		else if (num < 0) {
			System.out.println("You entered a negative number");
		}
		
		else {
			System.out.println("You entered zero");
		}
		
		input.close();

	}

}
