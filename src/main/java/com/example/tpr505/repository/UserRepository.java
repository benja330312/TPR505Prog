package com.example.tpr505.repository;

import com.example.tpr505.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
