package com.shoppinhapi.common;

import entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repositories.RoleRepository;

@SpringBootApplication
@EntityScan(basePackages = {"entities"})
@ComponentScan
@EnableJpaRepositories({"repositories"})
public class CommonApplication implements CommandLineRunner {

    @Autowired
    public RoleRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var s = new Role();
        s.setName("d445d");
        repository.save(s);
    }
}
