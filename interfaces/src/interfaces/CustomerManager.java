package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosly - tightly coupled, baðýmlýlýk. loggera baðýmlý
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi "+ customer.getFirstName());
		//utilsde static yapýlýnca utils i newlemeye gerek yok. direk gelir.
		Utils.runLoggers(loggers, customer.getFirstName());
		
		}
	
		//DataBaseLogger logger = new DataBaseLogger(); //sýký sýkýya tightly aþýrý baðýmlý
		//logger.log(customer.getFirstName() + " Veri tabanýna loglandý");
		
	
	
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi "+ customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
