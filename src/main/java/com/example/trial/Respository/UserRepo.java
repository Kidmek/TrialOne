package com.example.trial.Respository;

import com.example.trial.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findUserByPhoneNumber(String phoneNumber);
}
