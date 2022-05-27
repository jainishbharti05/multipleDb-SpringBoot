package com.datagrokr.assignment.multipledb.primary.dao;

import com.datagrokr.assignment.multipledb.primary.entity.PrimaryBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryBookRepository extends JpaRepository<PrimaryBook, Integer> {
}
