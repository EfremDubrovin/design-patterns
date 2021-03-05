package customer.service;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 05/03/2021.
 */
public interface CustomerRepository {

	Customer findById(Integer id);

	void save(Customer customer);
}
