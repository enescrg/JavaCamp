package interfaces;

public class Utils { //araç, tekrar etmemek için blok oluþturuyoruz
		public static void runLoggers(Logger[] loggers, String message) { 
			for (Logger logger: loggers) {
				logger.log(message);
			}
		}
}
