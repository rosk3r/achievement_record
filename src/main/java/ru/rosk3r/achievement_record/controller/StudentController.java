package ru.rosk3r.achievement_record.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rosk3r.achievement_record.model.entity.Student;
import ru.rosk3r.achievement_record.model.request.StudentRequest;
import ru.rosk3r.achievement_record.service.StudentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody StudentRequest studentRequest) {
        return new ResponseEntity<>(studentService.create(studentRequest), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Student>> readAll() {
        return new ResponseEntity<>(studentService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/get-by-education-type")
    public ResponseEntity<List<Student>> getByEducationType(@RequestBody StudentRequest studentRequest) {
        return new ResponseEntity<>(studentService.getByEducationType(studentRequest.getEducationType()), HttpStatus.OK);
    }

    @GetMapping("/get-by-full-name")
    public ResponseEntity<List<Student>> getByFullName(@RequestBody StudentRequest studentRequest) {
        return new ResponseEntity<>(studentService.getByFullName(studentRequest.getFirstName(),
                studentRequest.getSecondName(), studentRequest.getMiddleName()), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.update(student), HttpStatus.OK);
    }

    @DeleteMapping("/{id}]")
    public HttpStatus delete(@PathVariable Long id) {
        studentService.delete(id);
        return HttpStatus.OK;
    }

}
