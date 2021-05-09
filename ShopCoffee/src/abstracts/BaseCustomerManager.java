package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi: " + customer.getFirstName() + " " + customer.getLastName());
	}

	
}
