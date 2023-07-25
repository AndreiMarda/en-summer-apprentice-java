package org.example.summer.dto;

import org.example.summer.model.TicketCategory;

import java.math.BigDecimal;

public class TicketCategoryDTO {
    private int ticketCategoryID;
    private int eventID;
    private String description;
    private Float price;

    public TicketCategoryDTO(TicketCategory ticketCategory) {
        this.ticketCategoryID = ticketCategory.getTicketCategoryId();
        this.eventID = ticketCategory.getEvent().getEventId();
        this.description = ticketCategory.getDescription();
        this.price = ticketCategory.getPrice();
    }
}
