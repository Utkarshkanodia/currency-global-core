package com.omega.currencyglobalcore.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.omega.currencyglobalcore.dao.entity.CurrencyRateEntity;

@Service
public interface CurrencyRateDao {

    public void saveAll(List<CurrencyRateEntity> entityList);

    public Double findRate(String from, String to, Date date);

}
