package com.example.tpr505.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private Role role;  // Utilisation de l'Enum Role

    // Constructeur sans arguments
    public User() {}

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {   // Getter pour "role"
        return role;
    }

    public void setRole(Role role) {   // Setter pour "role"
        this.role = role;
    }
}
