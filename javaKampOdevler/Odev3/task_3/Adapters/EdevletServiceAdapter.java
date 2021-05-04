package task_3.Adapters;

import task_3.Entities.Customer;
import task_3.Abstract.CustomerCheckService;

public class EdevletServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return customer.getNationalIdentity().length() == 11;
    }
}
