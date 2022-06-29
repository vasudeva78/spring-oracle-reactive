package com.reactive.spring.oracle.repository;

import com.reactive.spring.oracle.entity.Customer;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CustomerRepository extends R2dbcRepository<Customer, Integer> {}
