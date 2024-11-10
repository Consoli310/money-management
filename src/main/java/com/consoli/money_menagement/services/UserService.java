package com.consoli.money_menagement.services;

import com.consoli.money_menagement.entities.User;
import com.consoli.money_menagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createAccount(String name, Double initialBalance) {
        User user = new User();
        user.setName(name);
        user.setBalance(initialBalance);
        return userRepository.save(user);
    }

    public User getAccountByName(String name) {
        return userRepository.findByName(name);
    }

    public User getAccountById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));
    }

    public void deposit(Long accountId, Double amount) {
        User user = userRepository.findById(accountId).orElseThrow();
        user.setBalance(user.getBalance() + amount);
        userRepository.save(user);
    }

    public void withdraw(Long accountId, Double amount) {
        User user = userRepository.findById(accountId).orElseThrow();
        if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            userRepository.save(user);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }
}