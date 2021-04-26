// Question 1

public class Average {

	public static void main(String[] args) {
		
		int[] numbers = {4, 5, 9, 4, 7};
		
		int total = 0;
		
		int i = 0;
		
		for (i = 0; i < numbers.length; i++) {
			
			total = total + numbers[i];
			
		}
		
		float average = (float) total/numbers.length;
		
		System.out.println("Average is: " + average);

	}

}
