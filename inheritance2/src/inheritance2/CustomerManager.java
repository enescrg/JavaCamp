package inheritance2;

public class CustomerManager { //müsteri iþlerini yapacak sýnýf 
	
		public void add(logger logger) { //burada ilk loggerdan kontrol edilir
			//müþteri ekleme kodlarý
			System.out.println("Müþteri eklendi");
			
			//bir iþ sýnýfýna baþka bir iþ sýnýfý loglanacaksa orada new'lenmez.
			//DataBaseLogger logger = new DataBaseLogger();
			
			logger.log();
		}
}
