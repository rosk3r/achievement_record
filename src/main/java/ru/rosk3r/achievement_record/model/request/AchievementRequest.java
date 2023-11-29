package ru.rosk3r.achievement_record.model.request;

import lombok.Data;

@Data
public class AchievementRequest {

    private Long eventId;
    private Long studentId;
    private String achievementLevel;

}
