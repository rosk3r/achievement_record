package ru.rosk3r.achievement_record.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Specialization {

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

}
