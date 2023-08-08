package org.example.summer.dto;

import org.example.summer.model.Customer;
import org.example.summer.model.TicketCategory;

import java.sql.Timestamp;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderDTO {
    private int orderId;
    private LocalDate orderedAt;
    private Customer customer;
    private TicketCategory ticketCategory;
    private int numberOfTickets;
    private Float totalPrice;

    public OrderDTO(int orderId, TicketCategory ticketCategory, int numberOfTickets) {
        this.orderId = orderId;
        this.ticketCategory = ticketCategory;
        this.numberOfTickets = numberOfTickets;
    }
    
    public OrderDTO(){}

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDate orderedAt) {
        this.orderedAt = orderedAt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
