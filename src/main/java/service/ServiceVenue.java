package service;

import com.endava.model.Venue;
import org.springframework.stereotype.Service;
import repository.VenueRepository;

import java.util.List;

@Service
public class ServiceVenue {
    private VenueRepository venue_repo;
    public List<Venue> venueFindAll(){return venue_repo.findAll();}
}
