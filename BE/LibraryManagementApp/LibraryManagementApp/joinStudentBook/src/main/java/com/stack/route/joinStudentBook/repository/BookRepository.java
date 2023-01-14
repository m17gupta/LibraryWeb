package com.stack.route.joinStudentBook.repository;

import com.stack.route.joinStudentBook.domain.AlloteBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<AlloteBook,Long> {
}
