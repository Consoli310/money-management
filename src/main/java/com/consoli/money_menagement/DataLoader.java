package com.consoli.money_menagement;

import com.consoli.money_menagement.entities.User;
import com.consoli.money_menagement.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Matheus", "matheus@example.com", "checking", 1000.00);
        userRepository.save(user);
        System.out.println("Usuário inicial criado no banco de dados.");
    }
}