package org.example.summer.service;

import org.example.summer.model.TicketCategory;
import org.springframework.stereotype.Service;
import org.example.summer.repository.TicketCategoryRepository;

import java.util.List;

@Service
public class TicketCategoryService {
    private TicketCategoryRepository ticketCategoryRepository;

    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }
    public List<TicketCategory> ticketcategoryFindAll(){return ticketCategoryRepository.findAll();}
}
