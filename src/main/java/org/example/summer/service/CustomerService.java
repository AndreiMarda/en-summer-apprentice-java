package org.example.summer.service;

import org.example.summer.repository.CustomerRepository;
import org.example.summer.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> customersFindAll(){return customerRepository.findAll();}
    public List<Customer> customerFindById(){ return customerRepository.findById();}
}
