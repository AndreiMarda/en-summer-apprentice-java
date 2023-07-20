package service;

import repository.UserDetailsRepository;

public class ServiceUserDetails {
    private UserDetailsRepository user_details;
    public ServiceUserDetails (UserDetailsRepository user_details){
        this.user_details = user_details;
    }
}
