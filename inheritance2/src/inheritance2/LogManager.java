package inheritance2;

public class LogManager {
	
	//Bu �ekilde kullan�m do�ru de�ildir. spagetti
	//birbirinin alternatifi olan kodlar i�in if yaz�lmaz
	public void log(int  logType) {
		if(logType == 1) {
			System.out.println("Veri taban�na logland�");
		}else if (logType == 2) {
			System.out.println("Dosyaya logland�");
		}else {
			System.out.println("Email g�derildi");
		}
	}
}


//1 - Database
//2 - File
//3 - Email