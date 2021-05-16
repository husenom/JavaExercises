//OOP Part 2 Exercise

public class Account {
	
	private String firstName;
	private String lastName;
	private long accountNumber;
	private double balance;
	private static long accountNum = 10001;

	public Account(String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNum++;
		this.balance = balance;
		
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public long getAccountName() {
		return accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public void debit(double withdraw) {
		
		System.out.println("Account Number: " + accountNumber);
		
		if (withdraw > this.balance) {

			System.out.println("Insufficient Balance");
			System.out.println();
		} else {
			
			this.balance = this.balance - withdraw;
			System.out.println("You have withdrawn: " + withdraw);

		}

	}

	public void credit(double deposit) {
		System.out.println("Your final balance is " + (this.balance + deposit));
		System.out.println();
	}
	
	
	
}
