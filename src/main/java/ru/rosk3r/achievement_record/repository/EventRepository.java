package ru.rosk3r.achievement_record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rosk3r.achievement_record.model.entity.Event;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByName(String name);

    List<Event> findByConductLevel(String conductLevel);

}
