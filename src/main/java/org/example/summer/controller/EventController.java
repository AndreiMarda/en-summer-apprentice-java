package org.example.summer.controller;

import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.Order;
import org.example.summer.dto.EventDTO;
import org.example.summer.dto.OrderDTO;
import org.example.summer.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.summer.service.EventService;

import java.util.List;

@RestController
public class EventController {
    private EventService eventService;
    @Autowired
    public EventController(EventService service_event){
        this.eventService = service_event;
    }
    @GetMapping ("/findEventId/{id}")
    public Event findEventById(@PathVariable int id){
        Event event = new Event();
        try{
            event = eventService.findById(id);
        } catch(EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return event;
    }

    @GetMapping("/events")
    public List<Event> getEvents(@RequestParam(value = "venue_id", required = false) int venueId,
                                    @RequestParam(value = "event_type_name", required = false) String eventTypeName) {
        List<Event> events = eventService.getEventsByVenue_idAndEvent_type_id(venueId, eventTypeName);

        return events;
    }

    @PostMapping("/postEvent")
    public Event createEvent(@RequestBody Event newEvent) throws Exception
    {
        return eventService.createEvent(newEvent);
    }
}