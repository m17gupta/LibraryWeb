package com.stackRoute.Auth.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data //getter abd getter
@Entity
public class Admin {
    @Id
    private String emailId;
    private String name, phoneNo,designation, password;


}
