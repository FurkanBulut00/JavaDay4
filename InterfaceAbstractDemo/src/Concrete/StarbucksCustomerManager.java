package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;
	
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customercheckService) {
		this.customerCheckService= customercheckService;
	}
	
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db : "+customer.getFirstName());
		}else {
			System.out.println("Ge�erli bir ki�i girmediniz");
		}
		
		
	}

	
}
