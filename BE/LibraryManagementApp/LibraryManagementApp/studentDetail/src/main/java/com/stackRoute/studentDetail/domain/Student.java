package com.stackRoute.studentDetail.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {
    @Id
    private String studentId;
    private String name, fatherName,course, branch,year,semester;
//    @OneToMany(targetEntity = Book.class, cascade = CascadeType.ALL)
//            @JoinColumn(name="ck_fk",referencedColumnName = "bookId")
//    List<Book> BookList;
}
