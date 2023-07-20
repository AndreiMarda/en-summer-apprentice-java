package service;

import repository.EventRepository;

public class ServiceEvent {
    private EventRepository event_repository;
    public ServiceEvent(EventRepository event_repository){
        this.event_repository = event_repository;
    }

}
