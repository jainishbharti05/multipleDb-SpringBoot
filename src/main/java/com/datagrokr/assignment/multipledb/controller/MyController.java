package com.datagrokr.assignment.multipledb.controller;


import com.datagrokr.assignment.multipledb.primary.dao.PrimaryBookRepository;
import com.datagrokr.assignment.multipledb.primary.dao.PrimarySalesRepository;
import com.datagrokr.assignment.multipledb.primary.dao.PrimaryUserRepository;
import com.datagrokr.assignment.multipledb.primary.entity.PrimaryBook;
import com.datagrokr.assignment.multipledb.primary.entity.PrimaryUser;
import com.datagrokr.assignment.multipledb.secondary.dao.SecondaryBookRepository;
import com.datagrokr.assignment.multipledb.secondary.dao.SecondaryUserRepository;
import com.datagrokr.assignment.multipledb.secondary.entity.SecondaryBook;
import com.datagrokr.assignment.multipledb.secondary.entity.SecondaryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    PrimaryBookRepository primaryBookRepository;
    @Autowired
    PrimaryUserRepository primaryUserRepository;
    @Autowired
    PrimarySalesRepository primarySalesRepository;
    @Autowired
    SecondaryBookRepository secondaryBookRepository;
    @Autowired
    SecondaryUserRepository secondaryUserRepository;

//  Primary Database Controller
//  Book Controller
    @RequestMapping(value="/primary/books", method= RequestMethod.GET)
    public List<PrimaryBook> getPrimaryDatabaseData() {
        return primaryBookRepository.findAll();
    }

    @GetMapping("/primary/books/{id}")
    public Optional<PrimaryBook> getBookById(@PathVariable("id") Integer primaryBookId){
        return primaryBookRepository.findById(primaryBookId);
    }

    @PostMapping("/primary/books")
    public PrimaryBook addPrimaryBook(@RequestBody PrimaryBook primaryBook){
        primaryBookRepository.save(primaryBook);
        return primaryBook;
    }

    @DeleteMapping("/primary/books/{id}")
    public void deletePrimaryBook(@PathVariable("id") Integer primaryBookId){
        primaryBookRepository.deleteById(primaryBookId);
    }

    @PutMapping("/primary/books/{id}")
    public PrimaryBook updatePrimaryBook(@PathVariable("id") Integer primaryBookId, @RequestBody PrimaryBook primaryBook){
        PrimaryBook book = new PrimaryBook();
        book = primaryBookRepository.findById(primaryBookId).orElse(new PrimaryBook());
        
        book.setPrimaryBookId(primaryBook.getPrimaryBookId());
        book.setPrimaryBookName(primaryBook.getPrimaryBookName());
        book.setPrimaryGenre(primaryBook.getPrimaryGenre());
        book.setPrimaryAuthor(primaryBook.getPrimaryAuthor());

        return primaryBookRepository.save(book);
    }

// User Controller
    @GetMapping("/primary/users")
    public List<PrimaryUser> getAllPrimaryUsers(){
        return primaryUserRepository.findAll();
    }

    @GetMapping("/primary/users/{id}")
    public Optional<PrimaryUser> getPrimaryUserById(@PathVariable("id") Integer primaryUserId){
        return primaryUserRepository.findById(primaryUserId);
    }

    @PostMapping("/primary/users")
    public PrimaryUser addPrimaryUser(@RequestBody PrimaryUser primaryUser){
        return primaryUserRepository.save(primaryUser);
    }

    @PutMapping("/primary/users/{id}")
    public PrimaryUser updatePrimaryUser(@PathVariable("id") Integer primaryUserId, @RequestBody PrimaryUser primaryUser){
        PrimaryUser user;
        user = primaryUserRepository.findById(primaryUserId).orElse(new PrimaryUser());

        user.setPrimaryUserName(primaryUser.getPrimaryUserName());

        return primaryUserRepository.save(user);
    }

    @DeleteMapping("/primary/users/{id}")
    public void deletePrimaryUser(@PathVariable("id") Integer primaryUserId){
        primaryUserRepository.deleteById(primaryUserId);
    }

//  Secondary Database Controllers
//  Books Controller
    @RequestMapping(value="/secondary/books", method=RequestMethod.GET)
    public List<SecondaryBook> getSecondaryDatabaseData() {
        return secondaryBookRepository.findAll();
    }

    @GetMapping("/secondary/books/{id}")
    public Optional<SecondaryBook> getSecondaryBookById(@PathVariable("id") Integer secondaryBookId){
        return secondaryBookRepository.findById(secondaryBookId);
    }

    @PostMapping("/secondary/books")
    public SecondaryBook addSecondaryBook(@RequestBody SecondaryBook secondaryBook){
        return secondaryBookRepository.save(secondaryBook);
    }

    @PutMapping("/secondary/books/{id}")
    public SecondaryBook updateSecondaryBook(@PathVariable("id") Integer secondaryBookId, @RequestBody SecondaryBook secondaryBook){
        SecondaryBook book = secondaryBookRepository.findById(secondaryBookId).orElse(new SecondaryBook());

        book.setSecondaryBookName(secondaryBook.getSecondaryBookName());
        book.setSecondaryGenre(secondaryBook.getSecondaryGenre());
        book.setSecondaryAuthor(secondaryBook.getSecondaryAuthor());
        return secondaryBookRepository.save(book);
    }

    @DeleteMapping("/secondary/books/{id}")
    public void deleteSecondaryBook(@PathVariable("id") Integer secondaryBookId){
        secondaryBookRepository.deleteById(secondaryBookId);
    }

// User Controller

    @GetMapping("/secondary/users")
    public List<SecondaryUser> getAllSecondaryUsers(){
        return secondaryUserRepository.findAll();
    }

    @GetMapping("/secondary/users/{id}")
    public Optional<SecondaryUser> getSecondaryUserById(@PathVariable("id") Integer secondaryUserId){
        return secondaryUserRepository.findById(secondaryUserId);
    }

    @PostMapping("/secondary/users")
    public SecondaryUser addSecondaryUser(@RequestBody SecondaryUser secondaryUser){
        return secondaryUserRepository.save(secondaryUser);
    }

    @PutMapping("/secondary/users/{id}")
    public SecondaryUser updateSecondaryUser(@PathVariable("id") Integer secondaryUserId, @RequestBody SecondaryUser secondaryUser){
        SecondaryUser user = secondaryUserRepository.findById(secondaryUserId).orElse(new SecondaryUser());

        user.setSecondaryUserName(secondaryUser.getSecondaryUserName());
        return secondaryUserRepository.save(user);
    }


}
