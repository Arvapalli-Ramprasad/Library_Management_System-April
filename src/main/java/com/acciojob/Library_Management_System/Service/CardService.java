package com.acciojob.Library_Management_System.Service;

import com.acciojob.Library_Management_System.Enum.CardStatus;
import com.acciojob.Library_Management_System.Models.LibraryCard;
import com.acciojob.Library_Management_System.Models.Student;
import com.acciojob.Library_Management_System.Repositories.CardRepository;
import com.acciojob.Library_Management_System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private StudentRepository studentRepository;
    public String addNewCard(){
        LibraryCard card = new LibraryCard();
        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBooksIssued(0);
        cardRepository.save(card);
        return "The card has been saved with ID "+card.getCardId();
    }

    public String associateCardAndStudent(Integer cardId, Integer studentId){
        LibraryCard card = cardRepository.findById(cardId).get();
        Student student = studentRepository.findById(studentId).get();
        card.setStudent(student);
        card.setCardStatus(CardStatus.Active);
        cardRepository.save(card);

        return "Associating Card and Student with caridId as "+cardId+" and studentId as "+studentId;

    }
}
