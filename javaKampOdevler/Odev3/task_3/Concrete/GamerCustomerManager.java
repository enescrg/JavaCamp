package task_3.Concrete;

import task_3.Abstract.BaseCustomerManager;
import task_3.Abstract.CustomerCheckService;
import task_3.Entities.Customer;

public class GamerCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public GamerCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void create(Customer customer) throws Exception {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.create(customer);
        }
        else{
            throw new Exception("Geçerli bir kişi değil!");
        }
    }
}
