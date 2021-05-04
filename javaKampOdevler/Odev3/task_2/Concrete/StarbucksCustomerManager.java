package task_2.Concrete;

import task_2.Abstract.BaseCustomerManager;
import task_2.Abstract.CustomerCheckService;
import task_2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            //System.out.println(customer.firstName + " : Not a valid person!");
            throw new Exception("Not a valid person");
        }
    }
}
