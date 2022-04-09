package lt.netcode.poll.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lt.netcode.poll.entities.Customer;
import lt.netcode.poll.services.CustomersService;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	@Autowired
	CustomersService customersService;
	
	//crossorigin reikalingas tam kad leistu kreiptis is keliu serveviu
	@CrossOrigin
	@GetMapping("/")
	public List<Customer> index(){
		return customersService.getCustomers();
	}
	
	@CrossOrigin
	@PostMapping("/")
	public Customer add(@RequestBody Customer s)
	{
		return customersService.saveCustomer(s);
	}
	

}
