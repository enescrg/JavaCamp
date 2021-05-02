package javaKampOdevler;

public class Productodev {
	public Productodev() {
		System.out.println("Getirildi");
		
	}
	
	public Productodev(int id,String name, double unitPrice, String detail) {
		this();
		this.id =id;
		this.name= name;
		this.unitPrice= unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
	
	
	
	
	
	
	

}
