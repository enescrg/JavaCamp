package task_2.Concrete;

import task_2.Abstract.CustomerCheckService;
import task_2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        return true;
    }
}
