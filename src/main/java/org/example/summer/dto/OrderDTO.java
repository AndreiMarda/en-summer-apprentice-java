package org.example.summer.dto;

import java.sql.Timestamp;

import java.math.BigDecimal;

public class OrderDTO {
    private int ticketCategoryID;
    private int numberOfTickets;

    public OrderDTO(int ticketCategoryID, int numberOfTickets, Double totalPrice) {
        this.ticketCategoryID = ticketCategoryID;
        this.numberOfTickets = numberOfTickets;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

}
