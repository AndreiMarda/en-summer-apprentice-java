package org.example.summer.repository;

import org.example.summer.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventTypeRepository extends JpaRepository<EventType, Integer> {
    Optional<EventType> searchByName(String name);
}