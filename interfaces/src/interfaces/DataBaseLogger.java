package interfaces;

public class DataBaseLogger implements Logger{

	@Override // normalde interface haz�r kullan�l�r ama bne overrode la eziyorum kendi loglamam� kullanabilirim
	public void log(String message) {
		System.out.println("Database logland�:" + message);
		
	}

}
