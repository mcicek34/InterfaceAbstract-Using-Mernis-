package entities;

import java.util.Date;
import _abstract.CustomerService;

public class Customer implements CustomerService {

	public int id;
	public String firstName;
	public String lastName;
	public Date dateofBirth;
	public String nationalityId;

	public Customer(int id, String firstName, String lastName, Date dateofBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationalityId = nationalityId;
	}

	@Override
	public void save(Customer customer) {

	}
}
