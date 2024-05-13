package com.acciojob.Library_Management_System.Models;

import com.acciojob.Library_Management_System.Enum.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;
    private int noOfPages;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @JoinColumn
    @ManyToOne
    private Author author;
}
