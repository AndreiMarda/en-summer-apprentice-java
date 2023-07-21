package service;

import com.endava.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EventRepository;

import java.util.List;
@Service
public class ServiceEvent {
    private EventRepository event_repository;

    public ServiceEvent (EventRepository event_repository){
        this.event_repository = event_repository;
    }
    public List<Event> eventFindAll(){
        System.out.println(event_repository.findAll());
        System.out.println("I AM HERE");
        return event_repository.findAll();
    }
}
