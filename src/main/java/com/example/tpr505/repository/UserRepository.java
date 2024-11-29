package com.example.tpr505.repository;

import com.example.tpr505.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Recherche d'un utilisateur par son nom d'utilisateur
    Optional<User> findByUsername(String username);

    // Vérifie si un utilisateur existe avec ce nom d'utilisateur
    boolean existsByUsername(String username);
}
