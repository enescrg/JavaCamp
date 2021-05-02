package inheritance;

public class CustomerManager {
	public void add(Customer customer) { //void :bana bir �ey ver, d�nd�rme-1.s�radaki customer onu extends eden classlar�n referanslar�n� tutabilir
		System.out.println(customer.customerNumber + " Kaydedildi.");
	}
	
	public void addMultiple(Customer[] customers) { //bulk operasyonu, birden fazla m�steriyi ayn� anda eklemek. ben sana bir array g�ndericem onu tek tek ekle
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
