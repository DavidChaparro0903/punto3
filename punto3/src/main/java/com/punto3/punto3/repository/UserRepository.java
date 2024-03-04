package com.punto3.punto3.repository;

import org.springframework.stereotype.Repository;

import com.punto3.punto3.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findAll();
    List<User> findByGender(char gender);
    List<User> findByNameStartingWithIgnoreCase(String name);
    
}
