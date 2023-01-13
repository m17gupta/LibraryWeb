package com.stack.route.joinStudentBook.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AllotedBookToStudent {
    @Id
    private String studentId;
    private String name, fatherName,course, branch,year,semester;
    private String bookId;
    private String subjectName;
}
