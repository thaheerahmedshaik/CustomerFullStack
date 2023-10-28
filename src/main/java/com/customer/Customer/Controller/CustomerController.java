package com.customer.Customer.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Customer.Repository.Service.CustomerService;
import com.customer.Customer.model.Customer;


@RestController
@RequestMapping("/customer")
@CrossOrigin(origins ="http://localhost:4200")
public class CustomerController {

	public CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService=customerService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getAllEmployees(){
		List<Customer> customers=  customerService.findAll();
		return new ResponseEntity<>(customers,HttpStatus.OK);
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Customer> findById(@PathVariable("id") Long id){
		Customer customer=customerService.findByCustomer(id);
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		Customer addCustomer=customerService.addCustomer(customer);
		return new ResponseEntity<>(addCustomer,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		Customer upadatecustomer=customerService.EditCustomer(customer);
		return new ResponseEntity<>(upadatecustomer,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id){
		customerService.deleteCustomerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
