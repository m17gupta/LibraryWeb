package com.stackRoute.studentDetail.controller;

import com.stackRoute.studentDetail.Exception.StudentAlreadyExists;
import com.stackRoute.studentDetail.Exception.StudentNotFound;
import com.stackRoute.studentDetail.domain.Student;
import com.stackRoute.studentDetail.service.StudentService;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-app/v2")
public class StudentController {
    @Autowired
    private StudentService studentService;
//http://localhost:8882/student-app/v2/add-student
    @PostMapping("/add-student")
    public ResponseEntity<?> addStudentDetail(@RequestBody Student student) throws StudentAlreadyExists {
        try {
            return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.OK);
        } catch (StudentAlreadyExists ex) {
            throw new StudentAlreadyExists();
        }
    }


    //http://localhost:8882/student-app/v2/get-all-student-list
    @GetMapping("/get-all-student-list")
    public ResponseEntity<?> getAllStudentList() {
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }


    ///http://localhost:8882/student-app/v2/update-student-data
    @PutMapping("/update-student-data")
    public ResponseEntity<?> updateStudentData(@RequestBody Student student) throws StudentNotFound {
        try {
            return new ResponseEntity<>(studentService.updateStudentData(student), HttpStatus.OK);

        } catch (StudentNotFound ex) {
            throw new StudentNotFound();
        }
    }

 ////http://localhost:8882/student-app/v2/delete-student-data/{studentId}
    @DeleteMapping("/delete-student-data/{studentId}")
    public ResponseEntity<?> deleteStudentData(@PathVariable String studentId){
        return new ResponseEntity<>(studentService.deleteStudentData(studentId), HttpStatus.OK);
    }
}
