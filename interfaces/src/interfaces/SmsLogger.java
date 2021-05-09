package interfaces;

public class SmsLogger implements Logger{ //logger ý smsloggera uyarla!! gerekli olan kodlarý yaz

	@Override // normalde interface hazýr kullanýlýr ama ben overrode'la eziyorum kendi loglamamý kullanabilirim
	public void log(String message) {
		System.out.println("Sms gönderildi: " + message);
		
	} 

}
