package interfaceAbstractDemo;

import java.util.Date;
import _abstract.BaseCustomerManager;
import adapters.MernisServisAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServisAdapter());
		customerManager.save(new Customer(1, "Mustafa", "ÇÝÇEK", new Date(1997,04,04), "37714537782"));
		System.out.println();
		
	}

}
