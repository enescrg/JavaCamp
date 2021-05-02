package interfaces;

public class DataBaseLogger implements Logger{

	@Override // normalde interface hazýr kullanýlýr ama bne overrode la eziyorum kendi loglamamý kullanabilirim
	public void log(String message) {
		System.out.println("Database loglandý:" + message);
		
	}

}
