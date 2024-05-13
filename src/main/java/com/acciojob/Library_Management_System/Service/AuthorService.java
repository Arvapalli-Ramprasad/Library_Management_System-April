package com.acciojob.Library_Management_System.Service;

import com.acciojob.Library_Management_System.Models.Author;
import com.acciojob.Library_Management_System.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public String addAuthor(Author author){
        authorRepository.save(author);
        return "Author has been saved successfully "+author.getAuthorId();

    }
    public Author getAuthorById(Integer authorId) throws Exception{
        Optional<Author> optionalAuthor = authorRepository.findById(authorId);
        if(optionalAuthor.isEmpty()){
            throw new Exception("Invalid authorId Entered");
        }
        Author author = optionalAuthor.get();
        return author;
    }
}
