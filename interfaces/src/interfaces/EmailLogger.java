package interfaces;

public class EmailLogger implements Logger {

	@Override // normalde interface haz�r kullan�l�r ama bne overrode la eziyorum kendi loglamam� kullanabilirim
	public void log(String message) {
		System.out.println("Email g�nderildi: " + message);
		
	}

}
