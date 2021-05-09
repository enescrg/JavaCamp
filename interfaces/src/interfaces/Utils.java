package interfaces;

//D�� class'� static veremezsin
//sadece inner(a�a��da yeni bir class) class'� verebilirsin
public class Utils { 
		//ara� g�revi g�recek, kendini tekrar etmemek i�in blok olu�turuyoruz
		// public statik yap�yoruz ��nk� her yerden ula��labilinir olur
		//static i�lemi i�lemi durdurana kadar bellekte kal�r, bu da pahal�d�r. Belle�i �i�irir.
		public static void runLoggers(Logger[] loggers, String message) { 
			for (Logger logger: loggers) {
				logger.log(message);
			}
		}
}
