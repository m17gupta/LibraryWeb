package com.stack.route.joinStudentBook.controller;

import com.stack.route.joinStudentBook.domain.AlloteBook;
import com.stack.route.joinStudentBook.domain.AlloteStudent;
import com.stack.route.joinStudentBook.service.AllotedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alloted-app/v4")
public class AllotedStudentController {
    @Autowired
    private AllotedBookService allotedBookService;

//http://localhost:8884/alloted-app/v4/add-data
    @PostMapping("/add-student/{bookName}")
    public ResponseEntity<?> addBookToStudent(@RequestBody AlloteStudent student,@PathVariable String bookName){
        return new ResponseEntity<>(allotedBookService.addStudentToBooK(student,bookName),HttpStatus.OK);
    }



    //http://localhost:8884/alloted-app/v4/add-book
    @PostMapping("/add-book/{studentId}")
    public ResponseEntity<?> addBookToStudent(@RequestBody AlloteBook book ,@PathVariable String studentId){
        return new ResponseEntity<>(allotedBookService.addBook(book,studentId),HttpStatus.OK);
    }
}
