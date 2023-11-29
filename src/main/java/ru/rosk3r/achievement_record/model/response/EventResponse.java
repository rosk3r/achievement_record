package ru.rosk3r.achievement_record.model.response;

import lombok.Data;

@Data
public class EventResponse {

    private Long id;
    private String name;
    private String description;
    private String conduct_level;

}
