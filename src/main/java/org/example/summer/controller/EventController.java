package org.example.summer.controller;

import jakarta.persistence.EntityNotFoundException;
import org.example.summer.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.summer.service.EventService;

import java.util.List;

@RestController
public class EventController {
    private EventService service_event;
    @Autowired
    public EventController(EventService service_event){
        this.service_event = service_event;
    }
//    @GetMapping("/events")
//    public List<Event> events(){
//        return service_event.eventFindAll();
//    }

//    @GetMapping("/eventsDTO")
//    public List<Event>

    @GetMapping ("/findEventId/{id}")
    public Event findEventById(@PathVariable int id){
        Event event = new Event();
        try{
            event = service_event.findById(id);
        } catch(EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return event;
    }

    @GetMapping("/events")
    public List<Event> getEvents(@RequestParam(value = "venue_id", required = false) int venueId,
                                    @RequestParam(value = "event_type_name", required = false) String eventTypeName) {
        List<Event> events = service_event.getEventsByVenue_idAndEvent_type_id(venueId, eventTypeName);

        return events;
    }

//    @PostMapping()


}
