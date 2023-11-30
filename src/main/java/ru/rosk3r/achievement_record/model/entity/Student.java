package ru.rosk3r.achievement_record.model.entity;

import jakarta.persistence.*;
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
@Table(name = "t_student")
public class Student {

    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;
    private String educationType;
    private Long groupId;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

}
