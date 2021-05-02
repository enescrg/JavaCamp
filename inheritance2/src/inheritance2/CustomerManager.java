package inheritance2;

public class CustomerManager { //müsteri iþlerini yapacak sýnýf //bir iþ sýnýfýna baþka bir iþ sýnýfý loglanacaksa orada new lenmez.
		public void add(logger logger) { //burada ilk loggerdan kontrol edilir
			//müþteri ekleme kodlarý
			System.out.println("Müþteri eklendi");
			
			logger.log();
		}
}
