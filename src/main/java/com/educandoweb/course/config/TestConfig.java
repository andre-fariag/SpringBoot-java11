package com.educandoweb.course.config;

import java.util.Arrays;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test") // a aplicacao so sera executada quando estiver no perfil de teste.
public class TestConfig implements CommandLineRunner{

    // essa classe tem dependencia com as informaçoes incluidas no banco 
    // de dados -> Classe UserRepository

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
        
    }

    
}