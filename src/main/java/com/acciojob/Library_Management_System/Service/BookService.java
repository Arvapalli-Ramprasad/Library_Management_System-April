package com.acciojob.Library_Management_System.Service;

import com.acciojob.Library_Management_System.Models.Author;
import com.acciojob.Library_Management_System.Models.Book;
import com.acciojob.Library_Management_System.Repositories.AuthorRepository;
import com.acciojob.Library_Management_System.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    public String addBook(Book book){
        bookRepository.save(book);
        return "Book has been saved successfully with bookId "+book.getBookId();
    }
    public String associateBookAndAuthor(Integer bookid, Integer authorId) throws Exception{
        Optional<Book> optionalBook = bookRepository.findById(bookid);

        if(optionalBook.isEmpty()){
            throw  new Exception("BookId Not found");
        }

        Optional<Author> optionalAuthor = authorRepository.findById(authorId);
        if(optionalAuthor.isEmpty()){
            throw new Exception("AuthorId not found");
        }

        Book book = optionalBook.get();
        Author author = optionalAuthor.get();

        book.setAuthor(author);
        author.setNoOfBooks(author.getNoOfBooks()+1);

        bookRepository.save(book);
        authorRepository.save(author);
        return "Book And Author Associated Successfully";
    }
}
