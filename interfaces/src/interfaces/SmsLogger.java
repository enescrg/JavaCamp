package interfaces;

public class SmsLogger implements Logger{ //logger � smsloggera uyarla

	@Override // normalde interface haz�r kullan�l�r ama bne overrode la eziyorum kendi loglamam� kullanabilirim
	public void log(String message) {
		System.out.println("Sms g�nderildi: " + message);
		
	} 

}
