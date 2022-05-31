package com.datagrokr.assignment.multipledb.secondary.service;


import com.datagrokr.assignment.multipledb.secondary.dao.SecondaryBookRepository;
import com.datagrokr.assignment.multipledb.secondary.entity.SecondaryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SecondaryBookService {

    private final SecondaryBookRepository secondaryBookRepository;

    @Autowired
    SecondaryBookService(SecondaryBookRepository secondaryBookRepository){
        this.secondaryBookRepository = secondaryBookRepository;
    }

    public List<SecondaryBook> getAllSecondaryBooks(){
        return secondaryBookRepository.findAll();
    }

    public Optional<SecondaryBook> getSecondaryBookById(Integer secondaryBookId){
        return secondaryBookRepository.findById(secondaryBookId);
    }

    public SecondaryBook addSecondaryBook(SecondaryBook secondaryBook){
        return secondaryBookRepository.save(secondaryBook);
    }

    public SecondaryBook addOrUpdateSecondaryBook(Integer secondaryBookId, SecondaryBook secondaryBook){
        SecondaryBook book = secondaryBookRepository.findById(secondaryBookId).orElse(new SecondaryBook());

        book.setSecondaryBookId(secondaryBook.getSecondaryBookId());
        book.setSecondaryBookName(secondaryBook.getSecondaryBookName());
        book.setSecondaryAuthor(secondaryBook.getSecondaryAuthor());
        book.setSecondaryGenre(secondaryBook.getSecondaryGenre());
        return secondaryBookRepository.save(book);
    }

    public String deleteSecondaryBook(Integer secondaryBookId){
        secondaryBookRepository.deleteById(secondaryBookId);
        return "Entity deleted successfully!";
    }
}
