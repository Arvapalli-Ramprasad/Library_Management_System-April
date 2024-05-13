package com.acciojob.Library_Management_System.Controller;

import com.acciojob.Library_Management_System.Service.CardService;
import com.acciojob.Library_Management_System.Service.StudentService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("card")
public class CardController {
    @Autowired
    private CardService cardService;
    @PostMapping("add")
    public String  addCard(){
        return cardService.addNewCard();
    }

    @PutMapping("associateCardAndStudent")
    public String associateCardAndStudent(@RequestParam("cardId") Integer cardId,
                                          @RequestParam("studentId") Integer studentId){
        return cardService.associateCardAndStudent(cardId,studentId);

    }
}
