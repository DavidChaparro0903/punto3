package com.punto3.punto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punto3.punto3.entity.User;
import com.punto3.punto3.repository.UserRepository;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;
    

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public List<User> getFindAll(){
        
        return userRepository.findAll();
    }
    public List<User> getContactsByGender(char gender) {
        return userRepository.findByGender(gender);
    }

    public List<User> getContactsByInitLetter(char initialLetter) {
        return userRepository.findByNameStartingWithIgnoreCase(String.valueOf(initialLetter));
    }


}
