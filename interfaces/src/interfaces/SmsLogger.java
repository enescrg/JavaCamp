package interfaces;

public class SmsLogger implements Logger{ //logger ý smsloggera uyarla

	@Override // normalde interface hazýr kullanýlýr ama bne overrode la eziyorum kendi loglamamý kullanabilirim
	public void log(String message) {
		System.out.println("Sms gönderildi: " + message);
		
	} 

}
