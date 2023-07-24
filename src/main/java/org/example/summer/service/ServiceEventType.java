package org.example.summer.service;

import org.example.summer.model.EventType;
import org.springframework.stereotype.Service;
import org.example.summer.repository.EventTypeRepository;
import java.util.List;
@Service
public class ServiceEventType {
    private EventTypeRepository event_type_repo;
    public List<EventType> event_typeFindAll()
    {
        return event_type_repo.findAll();
    }
}
