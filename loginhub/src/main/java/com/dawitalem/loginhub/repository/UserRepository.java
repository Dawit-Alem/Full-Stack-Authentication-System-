package com.dawitalem.loginhub.repository;

import com.dawitalem.loginhub.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserRepository> findByEmail(String email);


}
