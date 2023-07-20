package service;

import repository.VenueRepository;

public class ServiceVenue {
    private VenueRepository venue_repo;
    public ServiceVenue(VenueRepository venue_repo){
        this.venue_repo = venue_repo;
    }
}
