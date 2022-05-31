package com.datagrokr.assignment.multipledb.controller;

import com.datagrokr.assignment.multipledb.primary.entity.PrimaryBook;
import com.datagrokr.assignment.multipledb.primary.entity.PrimaryUser;
import com.datagrokr.assignment.multipledb.primary.service.PrimaryBookService;
import com.datagrokr.assignment.multipledb.primary.service.PrimaryUserService;
import com.datagrokr.assignment.multipledb.secondary.entity.SecondaryBook;
import com.datagrokr.assignment.multipledb.secondary.entity.SecondaryUser;
import com.datagrokr.assignment.multipledb.secondary.service.SecondaryBookService;
import com.datagrokr.assignment.multipledb.secondary.service.SecondaryUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    PrimaryBookService primaryBookService;
    PrimaryUserService primaryUserService;
    SecondaryBookService secondaryBookService;
    SecondaryUserService secondaryUserService;

    @Autowired
    public MyController(PrimaryBookService primaryBookService, PrimaryUserService primaryUserService, SecondaryBookService secondaryBookService, SecondaryUserService secondaryUserService) {
        this.primaryBookService = primaryBookService;
        this.primaryUserService = primaryUserService;
        this.secondaryBookService = secondaryBookService;
        this.secondaryUserService = secondaryUserService;
    }

    //  Primary Database Controller
//  Book Controller
    @RequestMapping(value="/primary/books", method= RequestMethod.GET)
    public List<PrimaryBook> getPrimaryDatabaseData() {
        return primaryBookService.getAllPrimaryBooks();
    }

    @GetMapping("/primary/books/{id}")
    public Optional<PrimaryBook> getBookById(@PathVariable("id") Integer primaryBookId){
        return primaryBookService.getPrimaryBookById(primaryBookId);
    }

    @PostMapping("/primary/books")
    public PrimaryBook addPrimaryBook(@RequestBody PrimaryBook primaryBook){
        return primaryBookService.addPrimaryBook(primaryBook);
    }

    @DeleteMapping("/primary/books/{id}")
    public String deletePrimaryBook(@PathVariable("id") Integer primaryBookId){
        return primaryBookService.deletePrimaryBook(primaryBookId);
    }

    @PutMapping("/primary/books/{id}")
    public PrimaryBook updatePrimaryBook(@PathVariable("id") Integer primaryBookId, @RequestBody PrimaryBook primaryBook){
        return primaryBookService.addOrUpdatePrimaryBook(primaryBookId,primaryBook);
    }

// User Controller
    @GetMapping("/primary/users")
    public List<PrimaryUser> getAllPrimaryUsers(){
        return primaryUserService.getAllPrimaryUsers();
    }

    @GetMapping("/primary/users/{id}")
    public Optional<PrimaryUser> getPrimaryUserById(@PathVariable("id") Integer primaryUserId){
        return primaryUserService.getPrimaryUserById(primaryUserId);
    }

    @PostMapping("/primary/users")
    public PrimaryUser addPrimaryUser(@RequestBody PrimaryUser primaryUser){
        return primaryUserService.addPrimaryUser(primaryUser);
    }

    @PutMapping("/primary/users/{id}")
    public PrimaryUser updatePrimaryUser(@PathVariable("id") Integer primaryUserId, @RequestBody PrimaryUser primaryUser){
        return primaryUserService.addOrUpdatePrimaryUser(primaryUserId, primaryUser);
    }

    @DeleteMapping("/primary/users/{id}")
    public String deletePrimaryUser(@PathVariable("id") Integer primaryUserId){
        return primaryUserService.deletePrimaryUser(primaryUserId);

    }

//  Secondary Database Controllers
//  Books Controller
    @RequestMapping(value="/secondary/books", method=RequestMethod.GET)
    public List<SecondaryBook> getSecondaryDatabaseData() {
        return secondaryBookService.getAllSecondaryBooks();
    }

    @GetMapping("/secondary/books/{id}")
    public Optional<SecondaryBook> getSecondaryBookById(@PathVariable("id") Integer secondaryBookId){
        return secondaryBookService.getSecondaryBookById(secondaryBookId);
    }

    @PostMapping("/secondary/books")
    public SecondaryBook addSecondaryBook(@RequestBody SecondaryBook secondaryBook){
        return secondaryBookService.addSecondaryBook(secondaryBook);
    }

    @PutMapping("/secondary/books/{id}")
    public SecondaryBook updateSecondaryBook(@PathVariable("id") Integer secondaryBookId, @RequestBody SecondaryBook secondaryBook){

        return secondaryBookService.addOrUpdateSecondaryBook(secondaryBookId, secondaryBook);
    }

    @DeleteMapping("/secondary/books/{id}")
    public String deleteSecondaryBook(@PathVariable("id") Integer secondaryBookId){
        return secondaryBookService.deleteSecondaryBook(secondaryBookId);
    }

// User Controller

    @GetMapping("/secondary/users")
    public List<SecondaryUser> getAllSecondaryUsers(){
        return secondaryUserService.getAllSecondaryUsers();
    }

    @GetMapping("/secondary/users/{id}")
    public Optional<SecondaryUser> getSecondaryUserById(@PathVariable("id") Integer secondaryUserId){
        return secondaryUserService.getSecondaryUserById(secondaryUserId);
    }

    @PostMapping("/secondary/users")
    public SecondaryUser addSecondaryUser(@RequestBody SecondaryUser secondaryUser){
        return secondaryUserService.addSecondaryUser(secondaryUser);
    }

    @PutMapping("/secondary/users/{id}")
    public SecondaryUser updateSecondaryUser(@PathVariable("id") Integer secondaryUserId, @RequestBody SecondaryUser secondaryUser){
        return secondaryUserService.addOrUpdateSecondaryUser(secondaryUserId, secondaryUser);
    }

    @DeleteMapping("/secondary/users/{id}")
    public String deleteSecondaryUser(@PathVariable("id") Integer secondaryUserId){
        return secondaryUserService.deleteSecondaryUser(secondaryUserId);

    }


}
