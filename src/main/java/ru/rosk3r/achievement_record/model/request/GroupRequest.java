package ru.rosk3r.achievement_record.model.request;

import lombok.Data;

@Data
public class GroupRequest {

    private Long specializationId;
    private String name;
    private int course;

}
