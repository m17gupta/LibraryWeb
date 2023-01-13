package com.stackRoute.studentDetail.repository;

import com.stackRoute.studentDetail.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
