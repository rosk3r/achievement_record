package ru.rosk3r.achievement_record.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rosk3r.achievement_record.model.entity.Group;
import ru.rosk3r.achievement_record.model.request.GroupRequest;
import ru.rosk3r.achievement_record.service.GroupService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/groups")
public class GroupController {

    private GroupService groupService;

    @PostMapping
    public ResponseEntity<Group> create(@RequestBody GroupRequest groupRequest) {
        return new ResponseEntity<>(groupService.create(groupRequest), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Group>> readAll() {
        return new ResponseEntity<>(groupService.readAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Group> update(@RequestBody Group group) {
        return new ResponseEntity<>(groupService.update(group), HttpStatus.OK);
    }

    @DeleteMapping("/{id}]")
    public HttpStatus delete(@PathVariable Long id) {
        groupService.delete(id);
        return HttpStatus.OK;
    }

}
