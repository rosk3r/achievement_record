package ru.rosk3r.achievement_record.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rosk3r.achievement_record.model.entity.Event;
import ru.rosk3r.achievement_record.model.request.EventRequest;
import ru.rosk3r.achievement_record.repository.EventRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public Event create(EventRequest eventRequest) {
        Event event = Event.builder()
                .name(eventRequest.getName())
                .description(eventRequest.getDescription())
                .conductLevel(eventRequest.getConductLevel())
                .build();

        return eventRepository.save(event);
    }

    public List<Event> readAll() {
        return eventRepository.findAll();
    }

    public Event update(Event event) {
        return eventRepository.save(event);
    }

    public void delete(Long id) {
        eventRepository.deleteById(id);
    }

    public List<Event> getByName(String name) {
        return eventRepository.findByName(name);
    }

    public List<Event> getByConductLevel(String conductLevel) {
        return eventRepository.findByConductLevel(conductLevel);
    }

}
