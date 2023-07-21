package com.endava.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ticket_category")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ticket_category_id")
    private int TicketCategory;
    @Column (name = "event_id")
    private int eventID;
    @Column (name = "description")
    private String description;
    @Column (name = "price")
    private BigDecimal price;

    public TicketCategory(){ }

    public int getTicketCategory() {
        return TicketCategory;
    }

    public void setTicketCategory(int ticketCategory) {
        TicketCategory = ticketCategory;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
