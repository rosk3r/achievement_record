package ru.rosk3r.achievement_record.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rosk3r.achievement_record.model.entity.Event;
import ru.rosk3r.achievement_record.model.request.EventRequest;
import ru.rosk3r.achievement_record.service.EventService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/events")
public class EventController {

    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event> create(@RequestBody EventRequest eventRequest) {
        return new ResponseEntity<>(eventService.create(eventRequest), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Event>> readAll() {
        return new ResponseEntity<>(eventService.readAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Event> update(@RequestBody Event event) {
        return new ResponseEntity<>(eventService.update(event), HttpStatus.OK);
    }

    @DeleteMapping("/{id}]")
    public HttpStatus delete(@PathVariable Long id) {
        eventService.delete(id);
        return HttpStatus.OK;
    }

}
