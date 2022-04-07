package com.apside.pz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apside.pz.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
