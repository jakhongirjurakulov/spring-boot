package com.clean.code.springboot.web.rest;

import com.clean.code.springboot.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentResource {
    @GetMapping("/students")
    public ResponseEntity getAll() {
        Student student1 = new Student(1L, "Jakhongir1", "Jurakulov1", "Java1");
        Student student2 = new Student(2L, "Jakhongir2", "Jurakulov2", "Java2");
        Student student3 = new Student(3L, "Jakhongir3", "Jurakulov3", "Java3");
        Student student4 = new Student(4L, "Jakhongir4", "Jurakulov4", "Java4");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        return ResponseEntity.ok(students);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity getOne(@PathVariable Long id, String name, String lastName, String course) {
        Student student = new Student(id, name, lastName, course);
        return ResponseEntity.ok(student);
    }

    @PostMapping("/students")
    public ResponseEntity create(@RequestBody Student student) {
        return ResponseEntity.ok(student);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity updateOne(@PathVariable Long id, @RequestBody Student newStudent) {
        Student student1 = new Student(1L, "Jakhongir1", "Jurakulov1", "Java1");
        student1.setId(id);
        student1.setName(newStudent.getName());
        student1.setLastName(newStudent.getLastName());
        return ResponseEntity.ok(student1);
    }
    
    @DeleteMapping("students/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return ResponseEntity.ok("Students was deleted.");
    }
}
