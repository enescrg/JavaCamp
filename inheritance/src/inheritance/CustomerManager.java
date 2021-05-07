package inheritance;

public class CustomerManager {
	
	//void :bana bir �ey ver, d�nd�rme-1.s�radaki customer onu extends eden classlar�n referanslar�n� tutabilir
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " Kaydedildi.");
	}
	
	//bulk insert, operasyonu: birden fazla m�steriyi ayn� anda eklemek. ben sana bir array g�ndericem onu tek tek ekle
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
