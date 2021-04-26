// Question 2

public class ArrayCheck {

	public static void main(String[] args) {

		int[] Array = { 4, 6, 7, 9};

		int x = 20;

		int i = 0;

		do {

			if (x == Array[i]) {

				System.out.println("Number is found in given array");
				break;

			}

			else {

				i++;

			}

		}

		while (i < Array.length);

		if (i == Array.length)

			System.out.println("Number is not found in given array");

	}

}
