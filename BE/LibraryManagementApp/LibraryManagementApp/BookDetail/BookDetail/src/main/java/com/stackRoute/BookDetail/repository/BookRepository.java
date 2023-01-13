package com.stackRoute.BookDetail.repository;

import com.stackRoute.BookDetail.domain.StudentBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookRepository extends JpaRepository<StudentBook,String> {
}
