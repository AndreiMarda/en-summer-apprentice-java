package org.example.summer.dto;

import java.sql.Timestamp;

import java.math.BigDecimal;

public class OrderDTO {
    private String customer_name;
    private String event_name;
    private String category;
    private Timestamp ordered_at;
    private Integer number_of_tickets;
    private BigDecimal total_price;

    public OrderDTO(String customer_name, String event_name, String category, Timestamp ordered_at, Integer number_of_tickets, BigDecimal total_price) {
        this.customer_name = customer_name;
        this.event_name = event_name;
        this.category = category;
        this.ordered_at = ordered_at;
        this.number_of_tickets = number_of_tickets;
        this.total_price = total_price;
    }

    public OrderDTO(){}

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Timestamp getOrdered_at() {
        return ordered_at;
    }

    public void setOrdered_at(Timestamp ordered_at) {
        this.ordered_at = ordered_at;
    }

    public Integer getNumber_of_tickets() {
        return number_of_tickets;
    }

    public void setNumber_of_tickets(Integer number_of_tickets) {
        this.number_of_tickets = number_of_tickets;
    }

    public BigDecimal getTotal_price() {
        return total_price;
    }

    public void setTotal_price(BigDecimal total_price) {
        this.total_price = total_price;
    }
}
