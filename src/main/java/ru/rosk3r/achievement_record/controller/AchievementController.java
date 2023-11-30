package ru.rosk3r.achievement_record.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rosk3r.achievement_record.model.entity.Achievement;
import ru.rosk3r.achievement_record.model.request.AchievementRequest;
import ru.rosk3r.achievement_record.service.AchievementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/achievements")
public class AchievementController {

    private AchievementService achievementService;

    @PostMapping
    public ResponseEntity<Achievement> create(@RequestBody AchievementRequest achievementRequest) {
        return new ResponseEntity<>(achievementService.create(achievementRequest), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Achievement>> readAll() {
        return new ResponseEntity<>(achievementService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/get-by-achievement-level")
    public ResponseEntity<List<Achievement>> getByAchievementLevel(@RequestBody AchievementRequest achievementRequest) {
        return new ResponseEntity<>(achievementService.
                getByAchievementLevel(achievementRequest.getAchievementLevel()), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Achievement> update(@RequestBody Achievement achievement) {
        return new ResponseEntity<>(achievementService.update(achievement), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        achievementService.delete(id);
        return HttpStatus.OK;
    }

}
