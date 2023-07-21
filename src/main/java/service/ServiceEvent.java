package service;

import com.endava.model.Event;
import org.springframework.stereotype.Service;
import repository.EventRepository;

import java.util.List;
@Service
public class ServiceEvent {
    private EventRepository event_repository;

    public List<Event> eventFindAll(){
        return event_repository.findAll();
    }
}
