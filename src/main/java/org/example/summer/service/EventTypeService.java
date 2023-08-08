package org.example.summer.service;

import org.example.summer.model.EventType;
import org.springframework.stereotype.Service;
import org.example.summer.repository.EventTypeRepository;
import java.util.List;
@Service
public class EventTypeService {
    private EventTypeRepository eventTypeRepository;

    public EventTypeService(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
    }
}
