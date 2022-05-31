package com.datagrokr.assignment.multipledb.primary.service;

import com.datagrokr.assignment.multipledb.primary.dao.PrimaryBookRepository;
import com.datagrokr.assignment.multipledb.primary.entity.PrimaryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrimaryBookService {

    private final PrimaryBookRepository primaryBookRepository;

    @Autowired
    PrimaryBookService(PrimaryBookRepository primaryBookRepository){
        this.primaryBookRepository = primaryBookRepository;
    }

    public List<PrimaryBook> getAllPrimaryBooks(){
       return primaryBookRepository.findAll();
    }

    public Optional<PrimaryBook> getPrimaryBookById(Integer primaryBookId){
        return primaryBookRepository.findById(primaryBookId);
    }

    public PrimaryBook addPrimaryBook(PrimaryBook primaryBook){
        return primaryBookRepository.save(primaryBook);
    }

    public PrimaryBook addOrUpdatePrimaryBook(Integer primaryBookId, PrimaryBook primaryBook){
        PrimaryBook book = primaryBookRepository.findById(primaryBookId).orElse(new PrimaryBook());

        book.setPrimaryBookId(primaryBook.getPrimaryBookId());
        book.setPrimaryBookName(primaryBook.getPrimaryBookName());
        book.setPrimaryAuthor(primaryBook.getPrimaryAuthor());
        book.setPrimaryGenre(primaryBook.getPrimaryGenre());

        return primaryBookRepository.save(book);
    }

    public String deletePrimaryBook(Integer primaryBookId){
        primaryBookRepository.deleteById(primaryBookId);
        return "Entity deleted successfully!";
    }


}
