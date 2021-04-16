// Question number 5

import java.util.Scanner;

public class AverageNum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter x: ");

		int num1 = input.nextInt();

		System.out.println("Enter y: ");

		int num2 = input.nextInt();

		int total = 0, i = 0;

		if (num1 < num2) {

			while (num1 <= num2) {
				total = total + num1;
				num1++;
				i++;
			}

			int aver = total / i;
			System.out.println("The average is: " + aver);
			
		} else {

			while (num2 <= num1) {
				total = total + num2;
				num2++;
				i++;
			}

			double aver = total / i;
			
			System.out.println("The average is: " + aver);
		}

		input.close();

	}

}
