package interfaces;

public class SmsLogger implements Logger{ //logger � smsloggera uyarla!! gerekli olan kodlar� yaz

	@Override // normalde interface haz�r kullan�l�r ama ben overrode'la eziyorum kendi loglamam� kullanabilirim
	public void log(String message) {
		System.out.println("Sms g�nderildi: " + message);
		
	} 

}
