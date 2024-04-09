package com.smp.sellmyposting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SellMyPostingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellMyPostingApplication.class, args);
    }

}
