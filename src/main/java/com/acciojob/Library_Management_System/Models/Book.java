package com.acciojob.Library_Management_System.Models;

import com.acciojob.Library_Management_System.Enum.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Book {
    @Id
    private String bookId;
    private String authorName;
    private String bookName;
    private int noOfPages;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;
}
