package org.example.summer.model;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "venue")
public class Venue implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "venue_id")
    private int venue_id;
    @Column (name = "type")
    private String type;
    @Column (name = "location")
    private String location;
    @Column (name = "capacity")
    private int capacity;

    public Venue(int venue_id, String type, String location, int capacity) {
        this.venue_id = venue_id;
        this.type = type;
        this.location = location;
        this.capacity = capacity;
    }

    public Venue(){ };

    public int getVenueID() {
        return venue_id;
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
        this.venue_id = venue_id;
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