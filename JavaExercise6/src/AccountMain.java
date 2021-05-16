//OOP Part 2 Exercise

public class AccountMain {

	public static void main(String[] args) {
		
		Account HagosGebru = new Account("Hagos", "Gebru", 5000);
		
		HagosGebru.debit(3000);
		HagosGebru.credit(1000);
		
		Account JamesBond = new Account("James", "Bond", 3000);
		
		JamesBond.debit(4000);
		
		Account Hussen = new Account("Hussen", "Ahmad", 8000);
		
		Hussen.debit(6000);
		Hussen.credit(8000);
		
		
	}

}
