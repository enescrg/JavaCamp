package javaKampOdevler;

public class Mainodev {

	public static void main(String[] args) {
		
		Productodev productodev1 = new Productodev(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", 0, "Engin Demirog");
		
		Productodev productodev2 = new Productodev(2, "Programlamaya Giri� i�in Temel Kurs", 0, "Engin Demirog");
		
		Productodev[] productsOdev = {productodev1, productodev2};
		
		for(Productodev productodev : productsOdev) {
			
			System.out.println(productodev.name);
		}
		
		
		System.out.println("-----------");
		
		
		System.out.println(productsOdev.length);
		
		
		Categoryodev categoryodev1= new Categoryodev();
		categoryodev1.id = 4;
		categoryodev1.name ="Ders Program�";
		
		Categoryodev categoryodev3= new Categoryodev();
		categoryodev3.id = 5;
		categoryodev3.name ="1.G�n Sonu Kay�t";
		
		Categoryodev categoryodev4= new Categoryodev();
		categoryodev4.id = 6;
		categoryodev4.name ="�dev 1";
		
		Categoryodev categoryodev5= new Categoryodev();
		categoryodev5.id = 7;
		categoryodev5.name ="�dev 2";
		
		Categoryodev categoryodev6= new Categoryodev();
		categoryodev6.id = 8;
		categoryodev6.name ="�dev 3";
		
		Categoryodev categoryodev7= new Categoryodev();
		categoryodev7.id = 9;
		categoryodev7.name ="De�erlendirme";
		
		
		System.out.println("-----------");
		
		
		ProductManagerodev productManager�dev= new ProductManagerodev();
		productManager�dev.startTheLesson(productodev1);
		
		productManager�dev.startTheLesson(productodev2);

	}

}
