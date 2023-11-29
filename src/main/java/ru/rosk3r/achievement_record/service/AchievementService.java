package ru.rosk3r.achievement_record.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rosk3r.achievement_record.model.entity.Achievement;
import ru.rosk3r.achievement_record.model.request.AchievementRequest;
import ru.rosk3r.achievement_record.repository.AchievementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AchievementService {

    private final AchievementRepository achievementRepository;

    public Achievement create(AchievementRequest achievementRequest) {
        Achievement achievement = Achievement.builder()
                .eventId(achievementRequest.getEventId())
                .studentId(achievementRequest.getEventId())
                .achievementLevel(achievementRequest.getAchievementLevel())
                .build();

        return achievementRepository.save(achievement);
    }

    public List<Achievement> readAll() {
        return achievementRepository.findAll();
    }

    public Achievement update(Achievement achievement) {
        return achievementRepository.save(achievement);
    }

    public void delete(Long id) {
        achievementRepository.deleteById(id);
    }

}
