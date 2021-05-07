package inheritance;

public class CustomerManager {
	
	//void :bana bir şey ver, döndürme-1.sıradaki customer onu extends eden classların referanslarını tutabilir
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " Kaydedildi.");
	}
	
	//bulk insert, operasyonu: birden fazla müsteriyi aynı anda eklemek. ben sana bir array göndericem onu tek tek ekle
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
