package com.acciojob.Library_Management_System.Controller;

import com.acciojob.Library_Management_System.Models.Author;
import com.acciojob.Library_Management_System.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @PostMapping("add")
    public String addAuthor(@RequestBody Author author){
        String response = authorService.addAuthor(author);
        return response;
    }

    @GetMapping("findAuthorById")
    public ResponseEntity findAuthorById(@RequestParam("authorId") Integer authorId){
        try{
            Author response = authorService.getAuthorById(authorId);
            return new ResponseEntity(response, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
