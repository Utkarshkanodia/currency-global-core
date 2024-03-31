package com.omega.currencyglobalcore.dao;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omega.currencyglobalcore.dao.entity.CurrencyDataEntity;

@Service
public class CurrencyDataDaoImpl implements CurrencyDataDao {

    @Autowired
    private CurrencyDataRepo repo;

    @Override
    public List<CurrencyDataEntity> findAll() {
        return repo.findAll();
    }
    @SuppressWarnings("null")
    @Override
    public void save(CurrencyDataEntity entity) {
        repo.save(entity);
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }

    @SuppressWarnings("null")
    @Override
    public void saveAll(List<CurrencyDataEntity> entityList) {
        repo.saveAll(entityList);
    }
    @Override
    public Set<String> getAllCodes() {
        return repo.findAllCodes();
    }

}
