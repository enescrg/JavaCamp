package javaKampOdevler;

public class Mainodev {

	public static void main(String[] args) {
		
		Productodev productodev1 = new Productodev(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", 0, "Engin Demirog");
		
		Productodev productodev2 = new Productodev(2, "Programlamaya Giriþ için Temel Kurs", 0, "Engin Demirog");
		
		Productodev[] productsOdev = {productodev1, productodev2};
		
		for(Productodev productodev : productsOdev) {
			
			System.out.println(productodev.name);
		}
		
		
		System.out.println("-----------");
		
		
		System.out.println(productsOdev.length);
		
		
		Categoryodev categoryodev1= new Categoryodev();
		categoryodev1.id = 4;
		categoryodev1.name ="Ders Programý";
		
		Categoryodev categoryodev3= new Categoryodev();
		categoryodev3.id = 5;
		categoryodev3.name ="1.Gün Sonu Kayýt";
		
		Categoryodev categoryodev4= new Categoryodev();
		categoryodev4.id = 6;
		categoryodev4.name ="Ödev 1";
		
		Categoryodev categoryodev5= new Categoryodev();
		categoryodev5.id = 7;
		categoryodev5.name ="Ödev 2";
		
		Categoryodev categoryodev6= new Categoryodev();
		categoryodev6.id = 8;
		categoryodev6.name ="Ödev 3";
		
		Categoryodev categoryodev7= new Categoryodev();
		categoryodev7.id = 9;
		categoryodev7.name ="Deðerlendirme";
		
		
		System.out.println("-----------");
		
		
		ProductManagerodev productManagerödev= new ProductManagerodev();
		productManagerödev.startTheLesson(productodev1);
		
		productManagerödev.startTheLesson(productodev2);

	}

}
