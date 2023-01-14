package com.stackRoute.studentDetail.service;

import com.stackRoute.studentDetail.Exception.StudentAlreadyExists;
import com.stackRoute.studentDetail.Exception.StudentNotFound;
import com.stackRoute.studentDetail.domain.Student;
import com.stackRoute.studentDetail.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addStudent(Student student) throws StudentAlreadyExists {
        if (studentRepository.findById(student.getStudentId()).isPresent()) {
            throw new StudentAlreadyExists();
        } else {

            return studentRepository.save(student);
        }
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList= studentRepository.findAll();
        return  studentList;
    }

    @Override
    public Student updateStudentData(Student student) throws StudentNotFound {
       if(studentRepository.findById(student.getStudentId()).isPresent()){
           return studentRepository.save(student);
       }
       else{
          throw new StudentNotFound();
       }
    }

    @Override
    public boolean deleteStudentData(String studentId) {
        if(studentRepository.findById(studentId).isPresent()){
            studentRepository.deleteById(studentId);
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public List<Student> search(String course, String branch, String semester) {
        List<Student> studentList= studentRepository.findAll();
        List<Student> students=studentList.stream().filter(i->i.getCourse().equalsIgnoreCase(course))
                .filter(i->i.getBranch().equalsIgnoreCase(branch)).filter(i->i.getSemester().equalsIgnoreCase(semester)).collect(Collectors.toList());
        return students;
    }
}
