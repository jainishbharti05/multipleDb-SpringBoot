package com.datagrokr.assignment.multipledb.secondary.dao;

import com.datagrokr.assignment.multipledb.secondary.entity.SecondarySales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondarySalesRepository extends JpaRepository<SecondarySales, Integer> {
}
