package task_3.Abstract;

import task_3.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void create(Customer customer) throws Exception {
        System.out.println(customer.getFirstName() + " kaydınız tamamlandı.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName() + " kaydınız silindi.");

    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + " bilgileriniz güncellendi.");

    }
}
