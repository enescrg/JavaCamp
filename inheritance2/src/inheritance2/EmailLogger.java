package inheritance2;

public class EmailLogger extends logger{ //overide, loggerde bu vardý ama ben eziyorum, kendi kodummu yazýca
	@Override
	public void log() {
		System.out.println("Email yollandý");
		
	}

}
