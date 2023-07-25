package org.example.summer.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ticket_category")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ticket_category_id")
    private int ticketCategoryId;
    @ManyToOne
    @JoinColumn (name = "event_id", referencedColumnName = "event_id")
    private Event event;
    @Column (name = "description")
    private String description;
    @Column (name = "price")
    private Float price;

    public TicketCategory(){ }

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategory) {
        ticketCategory = ticketCategory;
    }

    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
