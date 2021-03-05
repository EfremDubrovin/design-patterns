package customer.persistence;

import customer.service.Customer;
import lombok.RequiredArgsConstructor;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 05/03/2021.
 */
@RequiredArgsConstructor
public class CustomerRepositoryImpl implements customer.service.CustomerRepository {

	private final InMemoryDataStore customerDb;

	public Customer findById(Integer id) {
		String customerName = customerDb.get(id);
		return new Customer(id, customerName);
	}

	public void save(Customer customer) {
		customerDb.put(customer.getId(), customer.getName());
	}
}
