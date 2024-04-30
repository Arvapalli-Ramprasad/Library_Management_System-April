package com.acciojob.Library_Management_System.Models;

import com.acciojob.Library_Management_System.Enum.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryCard {
    @Id

    private int cardId;
    private int noOfBooksIssued;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

        //this as to be written in child class
    @JoinColumn//adds another column which is primary key of other table


    //If we add other column other than pk then do
    //@JoinColumn(referencedColumnName = "emailId")

    @OneToOne//mapping between columns
    private Student student;//choose which entity to be added
}
