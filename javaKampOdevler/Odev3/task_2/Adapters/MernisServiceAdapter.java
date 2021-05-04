package task_2.Adapters;

import task_2.Abstract.CustomerCheckService;
import task_2.Entities.Customer;
import task_2.MernisService.TDFKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {

        TDFKPSPublicSoap publicSoap = new TDFKPSPublicSoap();

        try {
            return publicSoap.TCKimlikNoDogrula(Long.valueOf(customer.nationalityId),customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth.getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
