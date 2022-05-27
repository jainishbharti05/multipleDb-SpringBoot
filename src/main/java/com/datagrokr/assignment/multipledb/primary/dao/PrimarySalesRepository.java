package com.datagrokr.assignment.multipledb.primary.dao;

import com.datagrokr.assignment.multipledb.primary.entity.PrimarySales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimarySalesRepository extends JpaRepository<PrimarySales, Integer> {
}
