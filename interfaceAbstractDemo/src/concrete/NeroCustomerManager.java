package concrete;

import _abstract.BaseCustomerManager;
import _abstract.CustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckServise;

	public NeroCustomerManager(CustomerCheckService customerCheckServise) {

		this.customerCheckServise = customerCheckServise;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckServise.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
