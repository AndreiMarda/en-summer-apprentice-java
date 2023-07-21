package com.endava.model;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "venue")
public class Venue implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "venue_id")
    private int venueID;
    @Column (name = "type")
    private String type;
    @Column (name = "location")
    private String location;
    @Column (name = "capacity")
    private int capacity;

    public Venue(){ };

    public int getVenueID() {
        return venueID;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setVenueID(int venueID) {
        this.venueID = venueID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}