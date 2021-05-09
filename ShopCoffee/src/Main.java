
import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Enes", "Çirað", LocalDate.of(1996, 10, 10), "55459588784");

		BaseCustomerManager customerManager =  new StarbucksCustomerManager(new MernisServiceAdapter());
				
		customerManager.save(customer1);
	}

}
