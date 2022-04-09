package lt.netcode.poll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.netcode.poll.entities.Customer;
import lt.netcode.poll.repositories.CustomerRepository;

@Service
public class CustomersService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	/** metodas pasiimti visa sarasa*/
	public List<Customer> getCustomers(){
		return customerRepository.findAll();	
	}

	/** metodas prideti nauja irasa */
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
}
