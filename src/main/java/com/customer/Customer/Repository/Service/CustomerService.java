package com.customer.Customer.Repository.Service;

import java.util.List;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.Customer.Exception.UserNotFoundException;
import com.customer.Customer.Repository.CustomerRepository;
import com.customer.Customer.model.Customer;

import jakarta.transaction.Transactional;


@Service
public class CustomerService {

	public final CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
		
	}
	
	public Customer addCustomer(Customer customer) {
	customer.setCustid(UUID.randomUUID().toString());
	    return customerRepository.save(customer);
	}
	
	
	public Customer findByCustomer(Long id) {
		return customerRepository.findCustomerById(id)
				.orElseThrow(()-> new UserNotFoundException("user Not Found"+id+"not found"));
	}
	
	public Customer EditCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	@Transactional
	public void deleteCustomerById(Long id) {
		customerRepository.deleteCustomerById(id);
	}

	
}
