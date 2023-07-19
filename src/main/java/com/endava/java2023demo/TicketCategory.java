package com.endava.java2023demo;

import jakarta.persistence.*;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TicketCategory;
    private int eventID;
    private String description;
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
