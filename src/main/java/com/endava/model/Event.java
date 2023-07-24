package com.endava.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "event")
public class Event implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "event_id")
    private int event_id;
    @JoinColumn (name = "event_type_id", referencedColumnName = "event_type_id")
    @ManyToOne
    private EventType event_type;
    @JoinColumn (name = "venue_id", referencedColumnName = "venue_id")
    @ManyToOne
    private Venue venue_id;
    @Column (name = "event_description")
    private String event_description;
    @Column (name = "event_name")
    private String event_name;
    @Column (name = "start_date")
    private Date start_date;
    @Column (name = "end_date")
    private Date end_date;

    public Event(int event_id, EventType event_type, Venue venue_id, String event_description, String event_name, Date start_date, Date end_date) {
        this.event_id = event_id;
        this.event_type = event_type;
        this.venue_id = venue_id;
        this.event_description = event_description;
        this.event_name = event_name;
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
        return event_description;
    }

    public void setDescription(String description) {
        this.event_description = description;
    }

    public String getName() {
        return event_name;
    }

    public void setName(String name) {
        this.event_name = name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
