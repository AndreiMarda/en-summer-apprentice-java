package org.example.summer.repository;

import org.example.summer.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    @Query("SELECT e FROM Event e WHERE e.venue.venueId = :venue_id AND e.eventType.name = :type_name")
    List<Event> searchByVenueAndType(@Param("venue_id") int venue_id, @Param("type_name") String type_name);

    @Query("SELECT e FROM Event e WHERE e.venue.venueId = :venue_id")
    List <Event> searchByVenue(@Param("venue_id") Integer venue_id);

    @Query("SELECT e FROM Event e WHERE e.eventType.name = :type_name")
    List<Event> searchByType(@Param("type_name") String type_name);
}