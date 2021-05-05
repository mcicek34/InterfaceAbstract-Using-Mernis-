package adapters;

import java.rmi.RemoteException;

import _abstract.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoap proxy = new KPSPublicSoapProxy();
		
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateofBirth.getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
