package com.punto3.punto3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.punto3.punto3.entity.User;
import com.punto3.punto3.service.UserService;

@RestController
@RequestMapping("/agenda")
public class agendaController {
    

    @Autowired
    private UserService userService;


    public agendaController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getContacts")
    public List<User> getContacts(){
        return userService.getFindAll();
    }

    
    @GetMapping("/getContactsByGender/{genero}")
    public List<User> getContactsByGender(@PathVariable char genero){
        return userService.getContactsByGender(genero);
    }

    
    @GetMapping("/getContactsByInitLetter/{letter}")
    public List<User> getContactsByInitLetter(@PathVariable char letter){
        return userService.getContactsByInitLetter(letter);
    }


}
