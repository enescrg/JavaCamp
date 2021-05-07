package inheritance2;

public class LogManager {
	
	//Bu þekilde kullaným doðru deðildir. spagetti
	//birbirinin alternatifi olan kodlar için if yazýlmaz
	public void log(int  logType) {
		if(logType == 1) {
			System.out.println("Veri tabanýna loglandý");
		}else if (logType == 2) {
			System.out.println("Dosyaya loglandý");
		}else {
			System.out.println("Email göderildi");
		}
	}
}


//1 - Database
//2 - File
//3 - Email