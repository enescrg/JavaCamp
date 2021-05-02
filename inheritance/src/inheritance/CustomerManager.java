package inheritance;

public class CustomerManager {
	public void add(Customer customer) { //void :bana bir þey ver, döndürme-1.sýradaki customer onu extends eden classlarýn referanslarýný tutabilir
		System.out.println(customer.customerNumber + " Kaydedildi.");
	}
	
	public void addMultiple(Customer[] customers) { //bulk operasyonu, birden fazla müsteriyi ayný anda eklemek. ben sana bir array göndericem onu tek tek ekle
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
