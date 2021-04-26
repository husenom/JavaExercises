// Question 3

public class ArrayIndex {

	public static void main(String[] args) {

		int[] Array = {4, 6, 7, 9};
		
		int x = 6;

		int i = 0;

		for (i = 0; i < Array.length; i++) {
			
			if (x==Array[i]) {
				
				System.out.println("Index of the entered number in the given array is: " + i);
				break;
			}
			
			else if (i == Array.length-1)
				
				System.out.println("The number is not found in the array.");
		}
		

	}

}
