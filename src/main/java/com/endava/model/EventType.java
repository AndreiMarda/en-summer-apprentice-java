package com.endava.model;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "event_type")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "event_type_id")
    private int event_type_id;
    @Column (name = "name")
    private String name;

    public EventType(int event_type_id, String name) {
        this.event_type_id = event_type_id;
        this.name = name;
    }

    public EventType(){ }

    public int getEvent_type_id() {
        return event_type_id;
    }

    public void setEvent_type_id(int event_type_id) {
        this.event_type_id = event_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
