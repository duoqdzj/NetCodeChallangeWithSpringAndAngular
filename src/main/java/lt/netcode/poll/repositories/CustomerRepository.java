package lt.netcode.poll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.netcode.poll.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{}


