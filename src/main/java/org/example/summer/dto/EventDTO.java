package org.example.summer.dto;

import java.sql.Timestamp;
import java.util.List;

public class EventDTO {
    private String name;
    private String event_type_id;
    private String description;
    private String location;
    private String location_type;
    private Timestamp start_date;
    private Timestamp end_date;
    private List<TicketCategoryDTO> ticketCategories;

    public EventDTO(){}

    public EventDTO(String name, String event_type_id, String description, String location, String location_type, Timestamp start_date, Timestamp end_date, List<TicketCategoryDTO> ticketCategories) {
        this.name = name;
        this.event_type_id = event_type_id;
        this.description = description;
        this.location = location;
        this.location_type = location_type;
        this.start_date = start_date;
        this.end_date = end_date;
        this.ticketCategories = ticketCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent_type_id() {
        return event_type_id;
    }

    public void setEvent_type_id(String event_type_id) {
        this.event_type_id = event_type_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }

    public Timestamp getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Timestamp end_date) {
        this.end_date = end_date;
    }

    public List<TicketCategoryDTO> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategoryDTO> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }
}
