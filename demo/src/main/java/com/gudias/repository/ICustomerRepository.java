package com.gudias.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gudias.domain.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {

}
