package com.stackRoute.BookDetail.controller;

import com.stackRoute.BookDetail.domain.StudentBook;
import com.stackRoute.BookDetail.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentBook-app/v3")
public class StudentBookController {

    @Autowired
    private BookService bookService;

//http://localhost:8883/studentBook-app/v3/add-book
    @PostMapping("/add-book")
    public ResponseEntity<?> addBook(@RequestBody StudentBook studentBook){
        return new ResponseEntity<>(bookService.addBook(studentBook), HttpStatus.OK);
    }
    //http://localhost:8883/studentBook-app/v3/get-all-book
    @GetMapping("/get-all-book")
    public ResponseEntity<?> getAllBook(){
        return  new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.OK);

    }


    //http://localhost:8883/studentBook-app/v3/update-book
    @PutMapping("/update-book")
    public ResponseEntity<?>updateBookData(@RequestBody StudentBook studentBook){
        return new ResponseEntity<>(bookService.updateBook(studentBook), HttpStatus.OK);
    }
}
