package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.models.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
