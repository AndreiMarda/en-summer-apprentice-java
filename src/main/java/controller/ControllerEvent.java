package controller;

import com.endava.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceEvent;

import java.util.List;

@RestController
public class ControllerEvent {
    private ServiceEvent service_event;
    public ControllerEvent(ServiceEvent service_event){
        this.service_event = service_event;
    }
    @GetMapping("/event")
    public List<Event> events(){
        return service_event.eventFindAll();
    }

}
