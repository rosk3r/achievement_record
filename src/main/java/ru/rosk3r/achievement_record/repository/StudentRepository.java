package ru.rosk3r.achievement_record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rosk3r.achievement_record.model.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> getByEducationType(String educationType);

    Student getByFirstName(String firstName);

    Student getByLastName(String lastName);

    Student getByMiddleName(String middleName);

    List<Student> getByFirstNameLikeIgnoreCaseAndLastNameLikeIgnoreCaseAndMiddleNameLikeIgnoreCase(
            String firstName, String lastName, String middleName);

}
