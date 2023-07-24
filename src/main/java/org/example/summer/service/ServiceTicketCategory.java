package org.example.summer.service;

import org.example.summer.model.TicketCategory;
import org.springframework.stereotype.Service;
import org.example.summer.repository.TicketCategoryRepository;

import java.util.List;

@Service
public class ServiceTicketCategory {
    private TicketCategoryRepository ticket_category_repository;
    public List<TicketCategory> ticketcategoryFindAll(){return ticket_category_repository.findAll();}
}
