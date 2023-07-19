package com.endava.java2023demo;
import jakarta.persistence.*;

@Entity
@Table(name = "EventType")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int eventTypeID;
    private String name;

    public EventType(int eventTypeID, String name) {
        this.eventTypeID = eventTypeID;
        this.name = name;
    }

    public EventType(){ }

    public int getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(int eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
