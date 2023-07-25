package org.example.summer.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "order_id")
    private int orderId;
    @JoinColumn (name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne
    private Customer customer;
    @JoinColumn (name = "ticket_category_id", referencedColumnName = "ticket_category_id")
    @ManyToOne
    private TicketCategory ticketCategory;
    @Column (name = "ordered_at")
    private LocalDate orderedAt;
    @Column (name = "number_of_tickets")
    private int numberOfTickets;
    @Column (name = "total_price")
    private Float price;

    public Orders() { }

    public int getOrderID() {
        return orderId;
    }

    public void setOrderID(int orderID) {
        this.orderId = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicket_categor() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticket_category) {
        this.ticketCategory = ticket_category;
    }

    public LocalDate getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDate ordered_at) {
        this.orderedAt = ordered_at;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int number_of_tickets) {
        this.numberOfTickets = number_of_tickets;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
