package interfaces;

//Dýþ class'ý static veremezsin
//sadece inner(aþaðýda yeni bir class) class'ý verebilirsin
public class Utils { 
		//araç görevi görecek, kendini tekrar etmemek için blok oluþturuyoruz
		// public statik yapýyoruz çünkü her yerden ulaþýlabilinir olur
		//static iþlemi iþlemi durdurana kadar bellekte kalýr, bu da pahalýdýr. Belleði þiþirir.
		public static void runLoggers(Logger[] loggers, String message) { 
			for (Logger logger: loggers) {
				logger.log(message);
			}
		}
}
