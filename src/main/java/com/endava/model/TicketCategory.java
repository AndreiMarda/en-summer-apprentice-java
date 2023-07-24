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
    private int ticketCategory;
    @Column (name = "event_id")
    private int event_id;
    @Column (name = "description")
    private String description;
    @Column (name = "price")
    private BigDecimal price;

    public TicketCategory(int ticketCategory, int event_id, String description, BigDecimal price) {
        this.ticketCategory = ticketCategory;
        this.event_id = event_id;
        this.description = description;
        this.price = price;
    }

    public TicketCategory(){ }

    public int getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(int ticketCategory) {
        ticketCategory = ticketCategory;
    }

    public int getEventID() {
        return event_id;
    }

    public void setEventID(int event_id) {
        this.event_id = event_id;
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
