package service;

import com.endava.model.TicketCategory;
import org.springframework.stereotype.Service;
import repository.EventRepository;
import repository.TicketCategoryRepository;

import java.util.List;

@Service
public class ServiceTicketCategory {
    private TicketCategoryRepository ticket_category_repository;
    public List<TicketCategory> ticketcategoryFindAll(){return ticket_category_repository.findAll();}
}
