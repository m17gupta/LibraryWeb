package com.stack.route.joinStudentBook.repository;

import com.stack.route.joinStudentBook.domain.AllotedBookToStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AllotedBookRepository extends JpaRepository<AllotedBookToStudent,String> {
//    @Query("select s from Student left join sb from StudentBook on s.course=?1 and sb.course=?1 ")
//    public List<AllotedBookToStudent> getAllStudent(String course);

}
