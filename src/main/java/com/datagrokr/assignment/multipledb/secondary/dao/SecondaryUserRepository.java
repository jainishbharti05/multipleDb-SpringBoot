package com.datagrokr.assignment.multipledb.secondary.dao;

import com.datagrokr.assignment.multipledb.secondary.entity.SecondaryUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondaryUserRepository extends JpaRepository<SecondaryUser, Integer> {
}
