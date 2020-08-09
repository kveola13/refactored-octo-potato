package com.kveola13.springaop.business;

import com.kveola13.springaop.aspect.TrackTime;
import com.kveola13.springaop.data.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business {
    @Autowired
    private Dao dao;

    @TrackTime
    public String calculateSomething() {
        return dao.retrieveSomething();
    }
}
