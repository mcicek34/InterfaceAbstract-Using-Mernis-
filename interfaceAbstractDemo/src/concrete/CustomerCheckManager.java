package concrete;

import _abstract.CustomerCheckService;
import _abstract.CustomerService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
