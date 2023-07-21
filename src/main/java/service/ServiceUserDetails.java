package service;

import com.endava.model.UserDetails;
import org.springframework.stereotype.Service;
import repository.UserDetailsRepository;

import java.util.List;

@Service
public class ServiceUserDetails {
    private UserDetailsRepository user_details;
    public List<UserDetails> userdetailsFindAll(){return user_details.findAll();}
}
