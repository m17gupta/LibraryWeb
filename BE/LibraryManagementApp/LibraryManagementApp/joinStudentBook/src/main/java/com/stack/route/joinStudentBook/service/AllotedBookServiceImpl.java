package com.stack.route.joinStudentBook.service;

import com.stack.route.joinStudentBook.domain.AllotedBookToStudent;
import com.stack.route.joinStudentBook.repository.AllotedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AllotedBookServiceImpl implements AllotedBookService {

    @Autowired
    private AllotedBookRepository allotedBookRepository;
    @Override
    public List<AllotedBookToStudent> getAllStudent(String course) {
//        return allotedBookRepository.getAllStudent(course);
        return null;
    }
}
