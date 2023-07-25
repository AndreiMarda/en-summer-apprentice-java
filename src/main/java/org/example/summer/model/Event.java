package org.example.summer.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "event")
public class Event implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "event_i]d")
    private int eventId;
    @JoinColumn (name = "event_type_id", referencedColumnName = "event_type_id")
    @ManyToOne
    private EventType eventType;
    @JoinColumn (name = "venue_id", referencedColumnName = "venue_id")
    @ManyToOne
    private Venue venue;
    @Column (name = "event_description")
    private String eventDescription;
    @Column (name = "event_name")
    private String eventName;
    @Column (name = "start_date")
    private Timestamp startDate;
    @Column (name = "end_date")
    private Timestamp endDate;
    @OneToMany(mappedBy = "event")
    private List<TicketCategory> ticketCategoriesList;


    public Event(int eventId, EventType eventType, Venue venue, String eventDescription, String eventName, Timestamp startDate, Timestamp endDate) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.venue = venue;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Event(){ }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }
}
