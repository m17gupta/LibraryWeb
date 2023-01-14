package com.stackRoute.BookDetail.service;

import com.stackRoute.BookDetail.domain.StudentBook;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    public  abstract StudentBook addBook(StudentBook studentBook);


    public abstract List<StudentBook> getAllBooks();

    public abstract StudentBook updateBook(StudentBook studentBook);
    public  abstract List<StudentBook>  searchBook(String course, String branch, String semester);
}
