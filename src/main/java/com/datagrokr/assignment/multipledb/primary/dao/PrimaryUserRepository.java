package com.datagrokr.assignment.multipledb.primary.dao;

import com.datagrokr.assignment.multipledb.primary.entity.PrimaryUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryUserRepository extends JpaRepository<PrimaryUser, Integer> {
}
