import java.util.Date;
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer(1, "Furkan", "Bulut",new Date(1996,6,27),"00000000000");
			customerManager.save(customer1);
			Customer customer2 = new Customer(2, "Musa", "Hýzýr",new Date(1994,6,16),"11111111111");
			customerManager.save(customer2);
	}

}
