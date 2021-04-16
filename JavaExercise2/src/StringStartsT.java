// Question number 2

import java.util.Scanner;

public class StringStartsT {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		
		String word = input.nextLine();
		
		if (word.charAt(0) == 'T') {
			System.out.println("Yes that is the string");
		}
		
		else {
			System.out.println("That is not the one");
		}	
		
		
		input.close();


	}

}
