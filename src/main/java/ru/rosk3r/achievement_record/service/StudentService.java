package ru.rosk3r.achievement_record.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rosk3r.achievement_record.model.entity.Student;
import ru.rosk3r.achievement_record.model.request.StudentRequest;
import ru.rosk3r.achievement_record.repository.StudentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student create(StudentRequest studentRequest) {
        Student student = Student.builder()
                .firstName(studentRequest.getFirstName())
                .secondName(studentRequest.getSecondName())
                .middleName(studentRequest.getMiddleName())
                .birthDate(studentRequest.getBirthDate())
                .educationType(studentRequest.getEducationType())
                .groupId(studentRequest.getGroupId())
                .build();

        return studentRepository.save(student);
    }

    public List<Student> readAll() {
        return studentRepository.findAll();
    }

    public Student update(Student student) {
        return studentRepository.save(student);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getByEducationType(String educationType) {
        return studentRepository.getByEducationType(educationType);
    }

    public List<Student> getByFullName(String firstName, String secondName, String middleName) {
        return studentRepository.getByFirstNameLikeIgnoreCaseAndSecondNameLikeIgnoreCaseAndMiddleNameLikeIgnoreCase(
                firstName, secondName, middleName);
    }

    public Student getByFirstName(String firstName) {
        return studentRepository.getByFirstName(firstName);
    }

    public Student getBySecondName(String secondName) {
        return studentRepository.getByFirstName(secondName);
    }

    public Student getByMiddleName(String middleName) {
        return studentRepository.getByFirstName(middleName);
    }

}
