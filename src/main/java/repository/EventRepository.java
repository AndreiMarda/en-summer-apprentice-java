package repository;

import com.endava.model.Event;
import com.endava.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventType, Integer> {
}