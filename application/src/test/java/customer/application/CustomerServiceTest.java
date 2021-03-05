package customer.application;

import customer.persistence.CustomerRepositoryImpl;
import customer.persistence.InMemoryDataStore;
import customer.service.Customer;
import customer.service.CustomerRepository;
import customer.service.CustomerService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 05/03/2021.
 */
public class CustomerServiceTest {

	private CustomerService customerService;

	@Before
	public void setUp() {
		CustomerRepository customerRepository = new CustomerRepositoryImpl(new InMemoryDataStore());
		customerService = new CustomerService(customerRepository);
	}

	@Test
	public void findById_should_find_Vasil() {
		// Given
		Customer vasil = new Customer(1, "Vasil");
		customerService.save(vasil);

		// When
		Customer foundCustomer = customerService.findById(1);

		//Then
		assertThat(foundCustomer.getName(), is("Vasil"));
	}
}
