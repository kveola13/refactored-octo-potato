package com.kveola13.springaop.data;

import com.kveola13.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
    @TrackTime
    public String retrieveSomething() {
        return "Dao";
    }
}
