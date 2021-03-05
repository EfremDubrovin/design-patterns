package principle.dependency.inversion.together;

import lombok.RequiredArgsConstructor;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 05/03/2021.
 */
@RequiredArgsConstructor
class CustomerRepository {

	private final InMemoryDataStore customerDb;

	public Customer findById(Integer id) {
		return customerDb.get(id);
	}

	public void save(Customer customer) {
		customerDb.put(customer.getId(), customer);
	}
}
