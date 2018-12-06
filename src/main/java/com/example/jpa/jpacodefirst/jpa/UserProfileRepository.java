package com.example.jpa.jpacodefirst.jpa;

import com.example.jpa.jpacodefirst.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}