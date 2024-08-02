package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.beans.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
