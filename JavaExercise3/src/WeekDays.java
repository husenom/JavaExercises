//Question number 3

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your integer from 1 to 7: ");

		int day = input.nextInt();

		String d = "";

		switch (day) {

		case 1:

			System.out.println("You entered 1 for Monday");
			d = "Monday";
			break;

		case 2:

			System.out.println("You entered 2 for Tuesday");
			d = "Tuesday";
			break;

		case 3:

			System.out.println("You entered 3 for Wednesday");
			d = "Wednesday";
			break;

		case 4:

			System.out.println("You entered 4 for Thursday");
			d = "Thursday";
			break;

		case 5:

			System.out.println("You entered 5 for Friday");
			d = "Friday";
			break;

		case 6:

			System.out.println("You entered 6 for Saturday");
			d = "Saturday";
			break;

		case 7:

			System.out.println("You entered 7 for Sunday");
			d = "Sunday";
			break;
		}

		if (day < 6) {

			System.out.println(d + " is a weekday");
		}

		else {
			System.out.println(d + " is a weekend");
		}

		input.close();

	}

}
