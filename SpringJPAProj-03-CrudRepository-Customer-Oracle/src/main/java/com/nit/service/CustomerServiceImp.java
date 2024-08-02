package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.beans.Customer;
import com.nit.repository.CustomerRepo;

@Service
public class CustomerServiceImp implements ICustomerService {
	@Autowired
	private CustomerRepo custRepo;

	@Override
	public String registerCustomer(Customer customer) {

		Customer cus = custRepo.save(customer);

		return "Customer added successfully with id :" + cus.getId();
	}

}
