package com.kveola13.springaop.business;

import com.kveola13.springaop.data.SecondDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondBusiness {
    @Autowired
    private SecondDao secondDao;

    public String calculateSomething() {
        return secondDao.retrieveSomething();
    }
}