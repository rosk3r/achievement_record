package ru.rosk3r.achievement_record.model.response;

import lombok.Data;

@Data
public class AchievementResponse {

    private Long eventId;
    private Long studentId;
    private String achievementLevel;
    private Long id;

}
