package com.stack.route.joinStudentBook.domain;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AlloteStudent {
    @Id
    private String studentId;
    private String name;
        private String fatherName;
    private String course;
    private String branch;
    private String year;
    private String semester;

    @OneToMany(targetEntity = AlloteBook.class, cascade = CascadeType.ALL)
            @JoinColumn(name="ck_fk",referencedColumnName = "studentId")
   List<AlloteBook> books;
}
