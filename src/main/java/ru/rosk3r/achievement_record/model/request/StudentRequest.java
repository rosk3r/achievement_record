package ru.rosk3r.achievement_record.model.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentRequest {

    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;
    private String educationType;
    private Long groupId;

}
