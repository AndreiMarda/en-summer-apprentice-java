package service;

import com.endava.model.Customer;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

import java.util.List;

@Service
public class ServiceUserDetails {
    private CustomerRepository user_details;
    public List<Customer> userdetailsFindAll(){return user_details.findAll();}
}
