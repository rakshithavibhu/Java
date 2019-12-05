package com.finalproject.project.service;

import com.finalproject.project.entity.User;
import com.finalproject.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> getAllUsers(){
        List<User> result = (List<User>) repository.findAll();
        if(result.size()>0){
            return result;
        }else{
            return new ArrayList<User>();
        }

    }

    public User getEmployeeById(Long id) throws Exception{
        Optional<User> us = repository.findById(id);
        if(us.isPresent()){
            return us.get();
        }else{
            throw new Exception();
        }
    }

    public User createOrUpdate(User entity){
        if(entity.getId()==null){
            entity= repository.save(entity);
            return entity;
        }else {
            Optional<User> emp = repository.findById(entity.getId());
            if(emp.isPresent()){
                User u = emp.get();
                u.setEmail(entity.getEmail());
                u.setFirstname(entity.getFirstname());
                u.setLastname(entity.getLastname());
                u.setFeedback(entity.getFeedback());
                u=repository.save(u);
                return u;
            }else{
                entity = repository.save(entity);
                return entity;
            }
        }
    }

    public void deleteUserById(Long id) throws Exception{
        Optional<User> emp = repository.findById(id);
        if (emp.isPresent()) {
            repository.deleteById(id);
        }
        else{
            throw new Exception("No records found");
        }
    }

}
