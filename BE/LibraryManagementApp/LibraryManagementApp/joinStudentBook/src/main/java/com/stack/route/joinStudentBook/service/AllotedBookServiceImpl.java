package com.stack.route.joinStudentBook.service;

import com.stack.route.joinStudentBook.domain.AlloteBook;
import com.stack.route.joinStudentBook.domain.AlloteStudent;
import com.stack.route.joinStudentBook.repository.BookRepository;
import com.stack.route.joinStudentBook.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
@Service
public class AllotedBookServiceImpl implements AllotedBookService {

    @Autowired
    private StudentRepository allotedBookRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public AlloteStudent addStudentToBooK(AlloteStudent student,String bookName) {
        if(allotedBookRepository.findById(student.getStudentId()).isPresent()){
            AlloteStudent student2=allotedBookRepository.findById(student.getStudentId()).get();
            List<AlloteBook> bookList = student2.getBooks();
            AlloteBook book2 = new AlloteBook();
            book2.setBookName(bookName);
            bookList.add(book2);
            return allotedBookRepository.save(student2);
        }
        else {
            AlloteStudent student1 = new AlloteStudent(student.getStudentId(), student.getName(), student.getFatherName()
                    , student.getCourse(), student.getBranch(), student.getYear(), student.getSemester(), new ArrayList<AlloteBook>());
            List<AlloteBook> bookList = student1.getBooks();
            AlloteBook book1 = new AlloteBook();
            book1.setBookName(bookName);
            bookList.add(book1);

            return allotedBookRepository.save(student1);
        }

    }

    @Override
    public AlloteBook addBook(AlloteBook book,String studentId) {
        if(allotedBookRepository.findById(studentId).isPresent()){
          AlloteStudent student=allotedBookRepository.findById(studentId).get();
          List<AlloteBook> books=student.getBooks();
          books.add(book);
          allotedBookRepository.save(student);
          return book;
        }
        return null;
    }

    @Override
    public List<AlloteStudent> getAllAlloted() {

        return allotedBookRepository.findAll();
    }
}
