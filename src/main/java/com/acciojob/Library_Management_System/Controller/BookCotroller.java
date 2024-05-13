package com.acciojob.Library_Management_System.Controller;

import com.acciojob.Library_Management_System.Models.Book;
import com.acciojob.Library_Management_System.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookCotroller{
    @Autowired
    private BookService bookService;
    @PostMapping("add")
    public String addBook(@RequestBody Book book){
        String response = bookService.addBook(book);
        return response;
    }

    @PutMapping("associateBookAndAuthor")
    public ResponseEntity associateBookAndAuthor(@RequestParam("bookId") Integer bookId,
                                                 @RequestParam("authorId") Integer authorId){
        try{
            String response = bookService.associateBookAndAuthor(bookId,authorId);
            return new ResponseEntity(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

}