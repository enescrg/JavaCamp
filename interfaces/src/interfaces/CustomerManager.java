package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosly - tightly coupled, ba��ml�l�k. loggera ba��ml�
	public void add(Customer customer) {
		System.out.println("M��teri eklendi "+ customer.getFirstName());
		//utilsde static yap�l�nca utils i newlemeye gerek yok. direk gelir.
		Utils.runLoggers(loggers, customer.getFirstName());
		
		}
	
		//DataBaseLogger logger = new DataBaseLogger(); //s�k� s�k�ya tightly a��r� ba��ml�
		//logger.log(customer.getFirstName() + " Veri taban�na logland�");
		
	
	
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi "+ customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
