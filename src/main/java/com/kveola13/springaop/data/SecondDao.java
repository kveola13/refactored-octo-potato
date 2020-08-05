package com.kveola13.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class SecondDao {
    public String retrieveSomething() {
        return "Second Dao";
    }
}