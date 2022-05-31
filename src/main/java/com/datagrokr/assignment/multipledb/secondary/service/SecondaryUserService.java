package com.datagrokr.assignment.multipledb.secondary.service;

import com.datagrokr.assignment.multipledb.secondary.dao.SecondaryUserRepository;
import com.datagrokr.assignment.multipledb.secondary.entity.SecondaryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecondaryUserService {

    private final SecondaryUserRepository secondaryUserRepository;

    @Autowired
    public SecondaryUserService(SecondaryUserRepository secondaryUserRepository) {
        this.secondaryUserRepository = secondaryUserRepository;
    }

    public List<SecondaryUser> getAllSecondaryUsers(){
        return secondaryUserRepository.findAll();
    }

    public Optional<SecondaryUser> getSecondaryUserById(Integer secondaryUserId){
        return secondaryUserRepository.findById(secondaryUserId);
    }

    public SecondaryUser addSecondaryUser(SecondaryUser secondaryUser){
        return secondaryUserRepository.save(secondaryUser);
    }

    public SecondaryUser addOrUpdateSecondaryUser(Integer secondaryUserId, SecondaryUser secondaryUser){
        SecondaryUser user = secondaryUserRepository.findById(secondaryUserId).orElse(new SecondaryUser());

        user.setSecondaryUserId(secondaryUserId);
        user.setSecondaryUserName(secondaryUser.getSecondaryUserName());
        return secondaryUserRepository.save(user);
    }

    public String deleteSecondaryUser(Integer secondaryUserId){
        secondaryUserRepository.deleteById(secondaryUserId);
        return "Entity deleted successfully!";
    }
}
