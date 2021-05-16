package Question7;

public class Instructor extends Person {

	private int grossSalary;

	public Instructor(String firstName, String lastName, long phone, int grossSalary) {
		super(firstName, lastName, phone);
		this.grossSalary = grossSalary;
	}

	public int getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}

	@Override
	public String toString() {
		return "Instructor [grossSalary=" + grossSalary + ", toString()=" + super.toString() + "]";
	}

	public void netSalary() {
		System.out.println("Instructor net salary is: $" + (grossSalary - (grossSalary * 0.2)));
	}

}
