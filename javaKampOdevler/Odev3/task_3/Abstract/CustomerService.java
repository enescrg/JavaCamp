package task_3.Abstract;

import task_3.Entities.Customer;

public interface CustomerService {
    void create(Customer customer) throws Exception;
    void update(Customer customer);
    void delete(Customer customer);
}
