package org.example.summer.service;

import jakarta.persistence.EntityNotFoundException;
import org.example.summer.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.summer.repository.EventRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEvent {
    private EventRepository event_repository;

    @Autowired
    public ServiceEvent(EventRepository event_repository) {
        this.event_repository = event_repository;
    }

    public List<Event> eventFindAll() {
        return event_repository.findAll();
    }

    public Event findById(int id) {
        Optional<Event> eventFindById = event_repository.findById(id);
        if (eventFindById.isPresent()) {
            return eventFindById.get();
        } else
            throw new EntityNotFoundException("Event not found " + eventFindById);
    }

    public List<Event> getEventsByVenue_idAndEvent_type_id(Integer venue_id, String event_type_name) {
        List<Event> result;
        if ((venue_id == null) && (event_type_name == null)) {
            return event_repository.findAll();
        }
        if (venue_id != null) {
            result = event_repository.searchByVenue(venue_id);
        } else if (event_type_name != null) {
            result = event_repository.searchByType(event_type_name);
        }else{
            result = event_repository.searchByVenueAndType(venue_id, event_type_name);
        }
        return result;
    }

    public Event getEventById(int event_id) {
        return event_repository.findById(event_id).orElse(null);
    }
}
