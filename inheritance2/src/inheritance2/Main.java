package inheritance2;

public class Main {

	public static void main(String[] args) { //loglama, kim ne zaman nerede ne yapt�, bunlar� bir yerde stoklars�n.
		//birbirinin alternatifi olan kodlar i�in if yaz�lmaz
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new fileLogger());
		
		System.out.println("---------------");
		
		customerManager.add(new SmsLogger());
	}

}
