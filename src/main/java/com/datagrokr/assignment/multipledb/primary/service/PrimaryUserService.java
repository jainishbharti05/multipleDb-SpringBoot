package com.datagrokr.assignment.multipledb.primary.service;

import com.datagrokr.assignment.multipledb.primary.dao.PrimaryUserRepository;
import com.datagrokr.assignment.multipledb.primary.entity.PrimaryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrimaryUserService {

    private final PrimaryUserRepository primaryUserRepository;

    @Autowired
    public PrimaryUserService(PrimaryUserRepository primaryUserRepository) {
        this.primaryUserRepository = primaryUserRepository;
    }

    public List<PrimaryUser> getAllPrimaryUsers(){
        return primaryUserRepository.findAll();
    }

    public Optional<PrimaryUser> getPrimaryUserById(Integer primaryUserId){
        return primaryUserRepository.findById(primaryUserId);
    }

    public PrimaryUser addPrimaryUser(PrimaryUser primaryUser){
        return primaryUserRepository.save(primaryUser);
    }

    public PrimaryUser addOrUpdatePrimaryUser(Integer primaryUserId, PrimaryUser primaryUser){
        PrimaryUser user = primaryUserRepository.findById(primaryUserId).orElse(new PrimaryUser());

        user.setPrimaryUserId(primaryUserId);
        user.setPrimaryUserName(primaryUser.getPrimaryUserName());
        return primaryUserRepository.save(user);
    }

    public String deletePrimaryUser(Integer primaryUserId){
        primaryUserRepository.deleteById(primaryUserId);
        return "Entity deleted successfully!";
    }
}
