package Question2;

public class StudentGrade {

	private int grade;

	public StudentGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void GradeLetter() {

		if (0 <= grade && grade <= 100) {

			if (grade <= 100 && grade >= 90) {
				System.out.println("A");
			} else if (90 > grade && grade >= 80) {
				System.out.println("B");
			} else if (80 > grade && grade >= 70) {
				System.out.println("C");
			} else if (70 > grade && grade >= 50) {
				System.out.println("D");
			} else
				System.out.println("F");

		}

		else
			System.out.println("Invalid input.");
	}

}
