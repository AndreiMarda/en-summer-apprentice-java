package com.endava.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "order_details")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "order_id")
    private int order_id;
    @JoinColumn (name = "user_id")
    @ManyToOne
    private UserDetails user;
    @JoinColumn (name = "ticket_category_id")
    @ManyToOne
    private TicketCategory ticket_categor;
    @Column (name = "ordered_at")
    private Date ordered_at;
    @Column (name = "number_of_tickets")
    private int number_of_tickets;
    @Column (name = "total_price")
    private BigDecimal price;

    public Order(int orderID, UserDetails user, TicketCategory ticket_categor, Date ordered_at, int number_of_tickets, BigDecimal price) {
        this.order_id = orderID;
        this.user = user;
        this.ticket_categor = ticket_categor;
        this.ordered_at = ordered_at;
        this.number_of_tickets = number_of_tickets;
        this.price = price;
    }

    public Order() { }

    public int getOrderID() {
        return order_id;
    }

    public void setOrderID(int orderID) {
        this.order_id = orderID;
    }

    public UserDetails getUser() {
        return user;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }

    public TicketCategory getTicket_categor() {
        return ticket_categor;
    }

    public void setTicket_categor(TicketCategory ticket_categor) {
        this.ticket_categor = ticket_categor;
    }

    public Date getOrdered_at() {
        return ordered_at;
    }

    public void setOrdered_at(Date ordered_at) {
        this.ordered_at = ordered_at;
    }

    public int getNumber_of_tickets() {
        return number_of_tickets;
    }

    public void setNumber_of_tickets(int number_of_tickets) {
        this.number_of_tickets = number_of_tickets;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
