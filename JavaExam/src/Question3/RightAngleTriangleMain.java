package Question3;

import java.util.Scanner;

public class RightAngleTriangleMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of row's of asterisk: ");

		int rows = input.nextInt();

		RightAngleTriangle array = new RightAngleTriangle(rows);

		array.triangle();

		input.close();

	}

}
