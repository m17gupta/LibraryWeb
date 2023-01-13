package com.stackRoute.BookDetail.service;

import com.stackRoute.BookDetail.domain.StudentBook;
import com.stackRoute.BookDetail.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public StudentBook addBook(StudentBook studentBook) {

        String bookId= studentBook.getCourse()+studentBook.getBranch()+studentBook.getSemester()+studentBook.getSubjectName();
        StudentBook book= new StudentBook(bookId,studentBook.getBranch(),studentBook.getSemester(),studentBook.getCourse()
        ,studentBook.getSubjectName());
        return  bookRepository.save(book);
    }

    @Override
    public List<StudentBook> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public StudentBook updateBook(StudentBook studentBook) {
       if(bookRepository.findById(studentBook.getBookId()).isPresent()){
          return bookRepository.save(studentBook);
       }
       else return null;
    }
}
