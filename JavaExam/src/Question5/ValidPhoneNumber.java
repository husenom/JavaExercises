package Question5;

public class ValidPhoneNumber {

	private long phoneNumber;

	public ValidPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void isValid() {

		int lengthOfPhone = String.valueOf(phoneNumber).length();

		if (lengthOfPhone == 10) {
			System.out.println("Valid phone number");
		} else if (lengthOfPhone > 10) {
			System.out.println("Invalid phone number (too long)");
		} else {
			System.out.println("Invalid phone number (too short)");
		}

	}

}
