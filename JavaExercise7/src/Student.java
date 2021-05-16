
public class Student implements Comparable<Student> {
	
	private String firstName;
	private int age;
	
	public Student (String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", age=" + age + "]";
	}
	
	public int compareTo(Student name) {
		int compareInt = this.firstName.compareTo(name.firstName);
		if(compareInt < 0) return -1;
		if(compareInt > 0) return 1;
		return 0;
		
	}

}
