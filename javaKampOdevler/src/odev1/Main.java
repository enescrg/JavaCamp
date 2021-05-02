package odev1;

public class Main {

		public static void main(String[] args) {
			
			Product product1 = new Product(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", 0, "Engin Demirog");
			
			Product product2 = new Product(2, "Programlamaya Giriþ için Temel Kurs", 0, "Engin Demirog");
			
			Product[] products = {product1, product2};
			
			for(Product product : products) {
				
				System.out.println(product.name);
			}
			
			
			System.out.println("-----------");
			
			
			System.out.println(products.length);
			
			
			Category category1= new Category();
			category1.id = 4;
			category1.name ="Ders Programý";
			
			Category categoryodev3= new Category();
			categoryodev3.id = 5;
			categoryodev3.name ="1.Gün Sonu Kayýt";
			
			Category categoryodev4= new Category();
			categoryodev4.id = 6;
			categoryodev4.name ="Ödev 1";
			
			Category categoryodev5= new Category();
			categoryodev5.id = 7;
			categoryodev5.name ="Ödev 2";
			
			Category categoryodev6= new Category();
			categoryodev6.id = 8;
			categoryodev6.name ="Ödev 3";
			
			Category categoryodev7= new Category();
			categoryodev7.id = 9;
			categoryodev7.name ="Deðerlendirme";
			
			
			System.out.println("-----------");
			
			
			ProductManager productManager= new ProductManager();
			productManager.startTheLesson(product1);
			
			productManager.startTheLesson(product2);

		}

}
