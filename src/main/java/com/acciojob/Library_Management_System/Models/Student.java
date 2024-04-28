package com.acciojob.Library_Management_System.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Student {
    @Id
    private int studentId;
    private String name;
    private int age;
    private String branch;
    private String emailId;
}
