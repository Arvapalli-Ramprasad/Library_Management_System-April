package com.acciojob.Library_Management_System.Models;

import com.acciojob.Library_Management_System.Enum.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

//    public int getCardId() {
//        return cardId;
//    }
//
//    public void setCardId(int cardId) {
//        this.cardId = cardId;
//    }
//
//    public int getNoOfBooksIssued() {
//        return noOfBooksIssued;
//    }
//
//    public void setNoOfBooksIssued(int noOfBooksIssued) {
//        this.noOfBooksIssued = noOfBooksIssued;
//    }
//
//    public CardStatus getCardStatus() {
//        return cardStatus;
//    }
//
//    public void setCardStatus(CardStatus cardStatus) {
//        this.cardStatus = cardStatus;
//    }
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
}
