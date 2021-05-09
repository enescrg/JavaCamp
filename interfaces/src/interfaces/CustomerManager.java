package interfaces;

public class CustomerManager {
	
	private Logger[] loggers; //neye baðlýysak onun private deðiþkenini yapýyoruz
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosly - tightly coupled, baðýmlýlýk. loggera baðýmlý
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi "+ customer.getFirstName());
	
		
		//utils class'da static yapýlýnca utils'i new'lemeye gerek yok. direk gelir.
		//Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
		
//		Utils class'a taþýdýk
//		logger array'ýný döndürmek için kullanýlýr
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName());
//		}

		
		//Array olmadan yazýlsa => this.loggers.log(customer.getFirstame());
		
		//customerManager'da sadece müþteriyi ilgilendiren kodlar yer alýr. Baþka managerler çaðrýlmaz.
		//sýký sýkýya, tightly aþýrý baðýmlý
		//DataBaseLogger logger = new DataBaseLogger();
		//logger.log(customer.getFirstName() + " Veri tabanýna loglandý");
				
		}
	
		
	
	
	//add ve delete metotlarýnda farklý operasyonlar kullanmak istersen
	//parametre kýsmýna (Logger[] loggers) enjekte etmek gerekir
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi "+ customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
