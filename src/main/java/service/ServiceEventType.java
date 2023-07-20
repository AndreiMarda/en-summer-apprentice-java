package service;

import repository.EventTypeRepository;

public class ServiceEventType {
    private EventTypeRepository event_type_repo;
    public ServiceEventType(EventTypeRepository event_type_repo) {
        this.event_type_repo = event_type_repo;
    }

}
