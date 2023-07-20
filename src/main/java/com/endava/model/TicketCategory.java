package com.endava.model;

import jakarta.persistence.*;

import java.io.Serializable;

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
    private int price;

    public TicketCategory(int ticketCategory, int eventID, String description, int price) {
        TicketCategory = ticketCategory;
        this.eventID = eventID;
        this.description = description;
        this.price = price;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}