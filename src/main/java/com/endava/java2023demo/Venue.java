package com.endava.java2023demo;
import jakarta.persistence.*;

@Entity
@Table(name = "Venue")
public class Venue {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int venueID;
    private String type;
    private String location;
    private int capacity;

    public Venue(int venueID, String type, String location, int capacity) {
        this.venueID = venueID;
        this.type = type;
        this.location = location;
        this.capacity = capacity;
    }

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