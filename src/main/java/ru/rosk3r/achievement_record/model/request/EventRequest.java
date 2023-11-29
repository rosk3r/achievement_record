package ru.rosk3r.achievement_record.model.request;

import lombok.Data;

@Data
public class EventRequest {

    private String name;
    private String description;
    private String conductLevel;

}
