package org.example.summer.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "order_id")
    private int order_id;
    @JoinColumn (name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne
    private Customer customer_id;
    @JoinColumn (name = "ticket_category_id", referencedColumnName = "ticket_category_id")
    @ManyToOne
    private TicketCategory ticket_category;
    @Column (name = "ordered_at")
    private Date ordered_at;
    @Column (name = "number_of_tickets")
    private int number_of_tickets;
    @Column (name = "total_price")
    private BigDecimal price;

    public Orders(int order_id, Customer customer_id, TicketCategory ticket_category, Date ordered_at, int number_of_tickets, BigDecimal price) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.ticket_category = ticket_category;
        this.ordered_at = ordered_at;
        this.number_of_tickets = number_of_tickets;
        this.price = price;
    }

    public Orders() { }

    public int getOrderID() {
        return order_id;
    }

    public void setOrderID(int orderID) {
        this.order_id = orderID;
    }

    public Customer getUser() {
        return customer_id;
    }

    public void setUser(Customer user) {
        this.customer_id = user;
    }

    public TicketCategory getTicket_categor() {
        return ticket_category;
    }

    public void setTicket_category(TicketCategory ticket_category) {
        this.ticket_category = ticket_category;
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
