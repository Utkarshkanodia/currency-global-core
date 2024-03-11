package com.omega.currencyglobalcore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omega.currencyglobalcore.dao.entity.CurrencyRateEntity;

interface CurrencyRateRepo extends JpaRepository<CurrencyRateEntity, Integer> {

}
