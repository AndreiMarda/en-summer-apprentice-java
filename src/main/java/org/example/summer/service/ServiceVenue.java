package org.example.summer.service;

import org.example.summer.repository.VenueRepository;
import org.example.summer.model.Venue;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVenue {
    private VenueRepository venue_repo;
    public List<Venue> venueFindAll(){return venue_repo.findAll();}
}
