package inheritance2;

public class CustomerManager { //m�steri i�lerini yapacak s�n�f //bir i� s�n�f�na ba�ka bir i� s�n�f� loglanacaksa orada new lenmez.
		public void add(logger logger) { //burada ilk loggerdan kontrol edilir
			//m��teri ekleme kodlar�
			System.out.println("M��teri eklendi");
			
			logger.log();
		}
}
