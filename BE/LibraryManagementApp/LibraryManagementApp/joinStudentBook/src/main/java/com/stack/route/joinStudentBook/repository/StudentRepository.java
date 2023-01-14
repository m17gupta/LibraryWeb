package com.stack.route.joinStudentBook.repository;

import com.stack.route.joinStudentBook.domain.AlloteStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<AlloteStudent,String> {
//    @Query("select s from Student left join sb from StudentBook on s.course=?1 and sb.course=?1 ")
//    public List<AllotedBookToStudent> getAllStudent(String course);

}
