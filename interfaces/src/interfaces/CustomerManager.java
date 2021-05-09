package interfaces;

public class CustomerManager {
	
	private Logger[] loggers; //neye ba�l�ysak onun private de�i�kenini yap�yoruz
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosly - tightly coupled, ba��ml�l�k. loggera ba��ml�
	public void add(Customer customer) {
		System.out.println("M��teri eklendi "+ customer.getFirstName());
	
		
		//utils class'da static yap�l�nca utils'i new'lemeye gerek yok. direk gelir.
		//Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
		
//		Utils class'a ta��d�k
//		logger array'�n� d�nd�rmek i�in kullan�l�r
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName());
//		}

		
		//Array olmadan yaz�lsa => this.loggers.log(customer.getFirstame());
		
		//customerManager'da sadece m��teriyi ilgilendiren kodlar yer al�r. Ba�ka managerler �a�r�lmaz.
		//s�k� s�k�ya, tightly a��r� ba��ml�
		//DataBaseLogger logger = new DataBaseLogger();
		//logger.log(customer.getFirstName() + " Veri taban�na logland�");
				
		}
	
		
	
	
	//add ve delete metotlar�nda farkl� operasyonlar kullanmak istersen
	//parametre k�sm�na (Logger[] loggers) enjekte etmek gerekir
	public void delete(Customer customer) {
		System.out.println("M��teri silindi "+ customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
