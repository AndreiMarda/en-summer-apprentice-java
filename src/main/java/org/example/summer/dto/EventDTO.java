package org.example.summer.dto;

import org.example.summer.model.Event;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class EventDTO {
    private int eventID;
    private String eventDescription;
    private String eventName;
    private Timestamp startDate;
    private Timestamp endDate;
    private List<TicketCategoryDTO> ticketCategoryDTOList;
    private VenueDTO venueDTO;
    private String eventTypeName;
    public EventDTO() {
    }

    public EventDTO(Event event) {
        this.eventID = event.getEventId();
        this.eventDescription = event.getEventDescription();
        this.eventName = event.getEventName();
        this.startDate = (Timestamp) event.getStartDate();
        this.endDate = (Timestamp) event.getEndDate();
        this.venueDTO = new VenueDTO();
        this.eventTypeName = event.getEventType().getName();
        this.ticketCategoryDTOList = new ArrayList<>();
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
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

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public List<TicketCategoryDTO> getTicketCategoryDTOList() {
        return ticketCategoryDTOList;
    }

    public void setTicketCategories(List<TicketCategoryDTO> ticketCategoryDTOList) {
        this.ticketCategoryDTOList = ticketCategoryDTOList;
    }
}