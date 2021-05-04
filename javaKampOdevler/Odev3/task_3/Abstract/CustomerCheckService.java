package task_3.Abstract;

import task_3.Entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
