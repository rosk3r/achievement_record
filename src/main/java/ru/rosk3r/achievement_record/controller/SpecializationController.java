package ru.rosk3r.achievement_record.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rosk3r.achievement_record.model.entity.Specialization;
import ru.rosk3r.achievement_record.model.request.SpecializationRequest;
import ru.rosk3r.achievement_record.service.SpecializationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/specializations")
public class SpecializationController {

    private SpecializationService specializationService;

    @PostMapping
    public ResponseEntity<Specialization> create(@RequestBody SpecializationRequest specializationRequest) {
        return new ResponseEntity<>(specializationService.create(specializationRequest), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Specialization>> readAll() {
        return new ResponseEntity<>(specializationService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/get-by-name")
    public ResponseEntity<List<Specialization>> getByName(@RequestBody SpecializationRequest specializationRequest) {
        return new ResponseEntity<>(specializationService.getByName(specializationRequest.getName()), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Specialization> update(@RequestBody Specialization specialization) {
        return new ResponseEntity<>(specializationService.update(specialization), HttpStatus.OK);
    }

    @DeleteMapping("/{id}]")
    public HttpStatus delete(@PathVariable Long id) {
        specializationService.delete(id);
        return HttpStatus.OK;
    }

}
