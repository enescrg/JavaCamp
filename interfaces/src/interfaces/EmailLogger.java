package interfaces;

public class EmailLogger implements Logger {

	@Override // normalde interface hazýr kullanýlýr ama bne overrode la eziyorum kendi loglamamý kullanabilirim
	public void log(String message) {
		System.out.println("Email gönderildi: " + message);
		
	}

}
