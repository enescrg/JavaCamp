package oop�ntro;

public class Main {

	public static void main(String[] args) {
		
		//referans olu�turma, intance
		Product product1 = new Product(1,"Lenovo v14", 15000, "16 GB Ram",10);
		//constructor
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("��ecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
//		2. ders sonu		
//		Product[] products = {product1,product2,product3};
//		
//		for (Product product : products) { //t�r� b�y�k harfle, onun k���k harflisini de de�i�ken olarak yazar�z
//			
//			System.out.println(product.name);
//		}
//		
//		System.out.println(products.length);
//		
//		
//		Category category1 =new Category();
//		category1.id=1;
//		category1.name = "Bilgisayar";
//		
//		Category category2 =new Category();
//		category2.id=2;
//		category2.name = "Ev/Bah�e";
//		
//		ProductManager productManager= new ProductManager();
//		productManager.addToCart(product1); //parantezin i�ine data g�nderilir. product'�n verisini g�derdik
//		
//		productManager.addToCart(product2);
//		
//		productManager.addToCart(product3);

	
	
	
	
	}

}
