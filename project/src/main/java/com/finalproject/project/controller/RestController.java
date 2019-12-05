package com.finalproject.project.controller;


import com.finalproject.project.entity.User;
import com.finalproject.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    UserService service;

    @RequestMapping("/")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/list")
    public  List<User> list(){
        List<User> l = service.getAllUsers();
        //model.addAttribute("users" ,l);
        return l;
    }

    @PostMapping(path="/createUser")
    public User createOrUpdate(@Valid @RequestBody User usr){
        service.createOrUpdate(usr);
        return usr;
    }

    @PutMapping(path = {"/edit/{id}"})
    public User getEmployeeById(@PathVariable("id") Optional<Long> idop, @Valid @RequestBody User usr) throws Exception{
        if(idop.isPresent()){
            User u = service.getEmployeeById(idop.get());
            u.setFirstname(u.getFirstname());
            u.setLastname(u.getLastname());
            u.setEmail(u.getEmail());
            u.setFeedback(u.getFeedback());
            u= service.createOrUpdate(u);
            return u;
        }else {
            throw new Exception("no records");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) throws Exception{
        service.deleteUserById(id);
        return ResponseEntity.ok().build();
    }

}
