package org.example.summer.service;

import org.example.summer.repository.VenueRepository;
import org.example.summer.model.Venue;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {
    private VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }
}
