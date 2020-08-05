package com.kveola13.springaop;

import com.kveola13.springaop.business.Business;
import com.kveola13.springaop.business.SecondBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Business business;

    @Autowired
    private SecondBusiness secondBusiness;


    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(business.calculateSomething());
        logger.info(secondBusiness.calculateSomething());
    }

}
