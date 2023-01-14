package com.stack.route.joinStudentBook.service;

import com.stack.route.joinStudentBook.domain.AlloteBook;
import com.stack.route.joinStudentBook.domain.AlloteStudent;

import java.awt.print.Book;
import java.util.List;

public interface AllotedBookService  {

    public abstract AlloteStudent addStudentToBooK(AlloteStudent student,String bookName);
    public abstract AlloteBook addBook(AlloteBook book, String studentId);

    public abstract List<AlloteStudent> getAllAlloted();
}
