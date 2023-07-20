package com.endava.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Table(name = "event")
public class Event implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "event_id")
    private int event_id;
    @JoinColumn (name = "event_type_id")
    @ManyToOne
    private EventType event_type;
    @JoinColumn (name = "venue_id")
    @ManyToOne
    private Venue venue_id;
    @Column (name = "description")
    private String description;
    @Column (name = "name")
    private String name;
    @Column (name = "start_date")
    private LocalDate start_date;
    @Column (name = "end_date")
    private LocalDate end_date;

    public Event(int event_id, EventType event_type, Venue venue_id, String description, String name, LocalDate start_date, LocalDate end_date) {
        this.event_id = event_id;
        this.event_type = event_type;
        this.venue_id = venue_id;
        this.description = description;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Event(){ }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public EventType getEvent_type() {
        return event_type;
    }

    public void setEvent_type(EventType event_type) {
        this.event_type = event_type;
    }

    public Venue getVenue_id() {
        return venue_id;
    }

    public void setVenue_id(Venue venue_id) {
        this.venue_id = venue_id;
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

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }
}
