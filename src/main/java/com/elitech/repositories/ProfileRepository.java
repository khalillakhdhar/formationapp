package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.models.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
