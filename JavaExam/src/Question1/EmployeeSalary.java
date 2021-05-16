package Question1;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		String name = "Hussein Hussein";
		String city_and_state = "Alexandria, VA";
		double gross_salary = 700000;
		double tax = 0.2;
		double net_salary = gross_salary - (gross_salary*tax);
		
		System.out.println("Hello my name is " + name + ", I live in " + city_and_state + ". My gross salary is $" + gross_salary + ". I pay $" + (gross_salary * tax) + " in tax and I take home $" + net_salary);
	}

}
