// Question 4

public class ArrayCopy {

	public static void main(String[] args) {

		int[] Array = { 3, 4, 5, 2 };

		String[] ArrayS = {null, null, null, null};

		int x = Array.length;

		int y = ArrayS.length;

		int[] Array2 = new int[x];

		String[] ArrayS2 = new String[y];

		for (int i = 0; i < Array.length; i++) {

			Array2[i] = Array[i];

			System.out.print(Array2[i] + " ");
			

		}
		System.out.println("\n");
		
		for (int i = 0; i < Array.length; i++) {

			ArrayS2[i] = ArrayS[i];

			System.out.print(ArrayS2[i] + " ");

		}

	}

}
