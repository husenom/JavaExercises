package Question2;

import java.util.Scanner;

public class StudentGradeMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your score: ");

		int grade = input.nextInt();

		StudentGrade yourGrade = new StudentGrade(grade);

		yourGrade.GradeLetter();

		input.close();

	}

}
