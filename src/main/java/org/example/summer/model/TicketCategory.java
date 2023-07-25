package org.example.summer.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ticket_category")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ticket_category_id")
    private int ticketCategoryId;
    @Column (name = "event_id")
    private int eventId;
    @Column (name = "description")
    private String description;
    @Column (name = "price")
    private int price;

    public TicketCategory(int ticketCategory, int event_id, String description, int price) {
        this.ticketCategoryId = ticketCategory;
        this.eventId = event_id;
        this.description = description;
        this.price = price;
    }

    public TicketCategory(){ }

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategory) {
        ticketCategory = ticketCategory;
    }

    public int getEventID() {
        return eventId;
    }

    public void setEventID(int event_id) {
        this.eventId = event_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
