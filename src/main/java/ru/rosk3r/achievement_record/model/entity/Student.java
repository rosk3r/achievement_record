package ru.rosk3r.achievement_record.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String firstName;
    private String secondName;
    private String middleName;
    private LocalDate birthDate;
    private String educationType;
    private Long groupId;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

}
