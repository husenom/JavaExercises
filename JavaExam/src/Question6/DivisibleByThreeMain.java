package Question6;

public class DivisibleByThreeMain {

	public static void main(String[] args) {

		int[] Array = { 4, 6, 5, 12 };

		int i = 0;

		do {

			if (Array[i] % 3 == 0) {

				System.out.println("MagicArray");
				break;

			}

			else {

				i++;

			}

		}

		while (i < Array.length);

		if (i == Array.length)

			System.out.println("non MagicArray");

	}

}
