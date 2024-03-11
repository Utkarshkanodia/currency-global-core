package com.omega.currencyglobalcore.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.omega.currencyglobalcore.dao.entity.CurrencyDataEntity;

@Repository
interface CurrencyDataRepo extends JpaRepository<CurrencyDataEntity, Integer> {

    @Query("select code from #{#entityName}")
    Set<String> findAllCodes();
}
