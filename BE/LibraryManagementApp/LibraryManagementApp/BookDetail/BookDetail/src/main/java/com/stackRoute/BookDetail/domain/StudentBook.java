package com.stackRoute.BookDetail.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class StudentBook {
    @Id
    private String bookId;
    private String branch,semester,course,subjectName;
}
