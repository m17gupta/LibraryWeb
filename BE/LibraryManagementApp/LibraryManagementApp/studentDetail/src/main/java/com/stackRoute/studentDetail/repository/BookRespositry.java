package com.stackRoute.studentDetail.repository;

import com.stackRoute.studentDetail.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespositry extends JpaRepository<Book,String> {
}
