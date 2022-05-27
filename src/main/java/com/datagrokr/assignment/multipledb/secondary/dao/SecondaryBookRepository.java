package com.datagrokr.assignment.multipledb.secondary.dao;

import com.datagrokr.assignment.multipledb.secondary.entity.SecondaryBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryBookRepository extends JpaRepository<SecondaryBook, Integer> {
}
