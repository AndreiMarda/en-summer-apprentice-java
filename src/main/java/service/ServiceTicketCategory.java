package service;

import com.endava.model.TicketCategory;
import repository.EventRepository;
import repository.TicketCategoryRepository;

public class ServiceTicketCategory {
    private TicketCategoryRepository ticket_category_repository;

    public ServiceTicketCategory(TicketCategoryRepository ticket_category_repository){
        this.ticket_category_repository = ticket_category_repository;
    }



}
