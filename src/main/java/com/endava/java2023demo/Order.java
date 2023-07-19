package com.endava.java2023demo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
    @JoinColumn (name = "userID")
    @ManyToOne
    private UserDetails user;
    @JoinColumn (name = "TicketCategoryID")
    @ManyToOne
    private TicketCategory Ticketcategor;
    private LocalDate orderedAt;
    private int numberofTickets;
    private int price;


}
