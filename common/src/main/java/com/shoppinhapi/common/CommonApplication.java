package com.shoppinhapi.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"entities"})
@EnableJpaRepositories({"repositories"})
public class CommonApplication  {



    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);

    }

}
