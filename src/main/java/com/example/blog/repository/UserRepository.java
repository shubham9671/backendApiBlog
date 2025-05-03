package com.example.blog.repository;

import com.example.blog.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}