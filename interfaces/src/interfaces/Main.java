package interfaces;

public class Main {

	public static void main(String[] args) {
		
		
		//�oklu loglamak i�in array kullan�l�r
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers); //newlwdiklerini de�i�tirebilirsin
		
		Customer engin = new Customer(1, "Engin ", "Demiro�");
		
		customerManager.add(engin);

	}

}
