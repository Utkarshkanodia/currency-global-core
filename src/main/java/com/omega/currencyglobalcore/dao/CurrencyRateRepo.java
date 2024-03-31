package com.omega.currencyglobalcore.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omega.currencyglobalcore.dao.entity.CurrencyRateEntity;

interface CurrencyRateRepo extends JpaRepository<CurrencyRateEntity, Integer> {

    CurrencyRateEntity findByFromCurrencyAndToCurrencyAndDate(String from, String to, Date date);

}
