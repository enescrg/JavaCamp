package inheritance2;

public class Main {

	public static void main(String[] args) { //loglama, kim ne zaman nerede ne yaptý, bunlarý bir yerde stoklarsýn.
		//birbirinin alternatifi olan kodlar için if yazýlmaz
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new fileLogger());
		
		System.out.println("---------------");
		
		customerManager.add(new SmsLogger());
	}

}
