package com.endava.java2023demo;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int eventID;
    @JoinColumn (name = "eventTypeID")
    @ManyToOne
    private EventType eventType;
    @JoinColumn (name = "venueID")
    @ManyToOne
    private Venue venueID;
    private String description;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public Event(int eventID, EventType eventType, Venue venueID, String description, String name, LocalDate startDate, LocalDate endDate) {
        this.eventID = eventID;
        this.eventType = eventType;
        this.venueID = venueID;
        this.description = description;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Event(){ }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Venue getVenueID() {
        return venueID;
    }

    public void setVenueID(Venue venueID) {
        this.venueID = venueID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
