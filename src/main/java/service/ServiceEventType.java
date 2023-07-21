package service;

import com.endava.model.EventType;
import org.springframework.stereotype.Service;
import repository.EventTypeRepository;
import java.util.List;
@Service
public class ServiceEventType {
    private EventTypeRepository event_type_repo;
    public List<EventType> event_typeFindAll()
    {
        return event_type_repo.findAll();
    }
}
