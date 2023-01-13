package com.stack.route.joinStudentBook.service;

import com.stack.route.joinStudentBook.domain.AllotedBookToStudent;

import java.util.List;

public interface AllotedBookService  {

    public abstract List<AllotedBookToStudent> getAllStudent(String course);
}
