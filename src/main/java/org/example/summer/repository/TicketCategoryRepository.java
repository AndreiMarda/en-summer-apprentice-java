package org.example.summer.repository;

import org.example.summer.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
    @Query("SELECT tc FROM TicketCategory tc WHERE tc.ticketCategoryId = :id")
    Optional<TicketCategory> searchById(@Param("id") Long id);
}