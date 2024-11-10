package com.consoli.money_menagement.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "db_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String accountType;
    private Double balance;
    private Timestamp createdAt;

    public User() {}

    public User(String name, String email, String accountType, Double balance) {
        this.name = name;
        this.email = email;
        this.accountType = accountType;
        this.balance = balance;
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}