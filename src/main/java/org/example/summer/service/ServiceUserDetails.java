package org.example.summer.service;

import org.example.summer.repository.CustomerRepository;
import org.example.summer.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUserDetails {
    private CustomerRepository user_details;
    public List<Customer> userdetailsFindAll(){return user_details.findAll();}
}
