package org.example.summer.model;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "event_type")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "event_type_id")
    private int eventTypeId;
    @Column (name = "name")
    private String name;

    public EventType(){ }

    public int getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
