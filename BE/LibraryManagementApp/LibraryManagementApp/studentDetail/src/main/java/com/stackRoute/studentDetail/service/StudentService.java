package com.stackRoute.studentDetail.service;

import com.stackRoute.studentDetail.Exception.StudentAlreadyExists;
import com.stackRoute.studentDetail.Exception.StudentNotFound;
import com.stackRoute.studentDetail.domain.Student;

import java.util.List;

public interface StudentService {

    public abstract  Student addStudent(Student student) throws StudentAlreadyExists;

    public abstract List<Student> getAllStudent();

    public  abstract Student updateStudentData(Student student) throws StudentNotFound;

    public  abstract  boolean deleteStudentData(String studentId);
}
