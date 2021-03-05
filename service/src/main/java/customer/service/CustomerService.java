package customer.service;

import lombok.RequiredArgsConstructor;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 05/03/2021.
 */
@RequiredArgsConstructor
public class CustomerService {

	private final CustomerRepository customerRepository;

	public void save(Customer customer) {
		customerRepository.save(customer);
	}

	public Customer findById(Integer id) {
		return customerRepository.findById(id);
	}
}
