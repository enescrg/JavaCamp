package interfaces;

public class Utils { //ara�, tekrar etmemek i�in blok olu�turuyoruz
		public static void runLoggers(Logger[] loggers, String message) { 
			for (Logger logger: loggers) {
				logger.log(message);
			}
		}
}
