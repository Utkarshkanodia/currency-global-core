package com.omega.currencyglobalcore.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omega.currencyglobalcore.dao.entity.CurrencyRateEntity;

@Service
public class CurrencyRateDaoImpl implements CurrencyRateDao{

    @Autowired
    private CurrencyRateRepo repo;

    @Override
    public void saveAll(List<CurrencyRateEntity> entityList) {
        repo.saveAll(entityList);
    }

}
