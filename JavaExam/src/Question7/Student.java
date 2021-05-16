package Question7;

public class Student extends Person {

	private int gpa;

	public Student(String firstName, String lastName, long phone, int gpa) {
		super(firstName, lastName, phone);
		this.gpa = gpa;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", toString()=" + super.toString() + "]";
	}

}
