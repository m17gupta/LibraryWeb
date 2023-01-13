package com.stack.route.joinStudentBook.controller;

import com.stack.route.joinStudentBook.service.AllotedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alloted-app/v4")
public class AllotedStudentController {
    @Autowired
    private AllotedBookService allotedBookService;
//http://localhost:8884/alloted-app/v4/get-alloted/B.tech
    @GetMapping("/get-alloted/{course}")
    public ResponseEntity<?> getAllotedStudentName(@PathVariable String course){
        return new ResponseEntity<>(allotedBookService.getAllStudent(course), HttpStatus.OK);
    }
}
