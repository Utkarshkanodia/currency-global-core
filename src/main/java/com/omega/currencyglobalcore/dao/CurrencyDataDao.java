package com.omega.currencyglobalcore.dao;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.omega.currencyglobalcore.dao.entity.CurrencyDataEntity;

@Service
public interface CurrencyDataDao {

    public void save(CurrencyDataEntity entity);

    public void saveAll(List<CurrencyDataEntity> entityList);

    public void deleteAll();

    public List<CurrencyDataEntity> findAll();

    public Set<String> getAllCodes();

}
