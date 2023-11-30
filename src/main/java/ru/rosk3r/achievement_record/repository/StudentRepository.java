package ru.rosk3r.achievement_record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rosk3r.achievement_record.model.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> getByEducationType(String educationType);

    Student getByFirstName(String firstName);

    Student getBySecondName(String secondName);

    Student getByMiddleName(String middleName);

    Student getByFirstNameAndSecondNameAndMiddleName(String firstName, String secondName, String middleName);

}
