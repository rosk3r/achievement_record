package ru.rosk3r.achievement_record.model.response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class StudentResponse {


    private String firstName;
    private String secondName;
    private String middleName;
    private LocalDate birthDate;
    private String educationType;
    private Long groupId;
    private Long id;

}
