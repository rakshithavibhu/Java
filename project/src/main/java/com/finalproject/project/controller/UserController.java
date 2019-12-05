package com.finalproject.project.controller;

import com.finalproject.project.entity.User;
import com.finalproject.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/")
    public String homepage(){
        return "homepage";
    }

    @RequestMapping(path="/list", method = RequestMethod.GET)
    public  String list(Model model){
        List<User> l = service.getAllUsers();
        model.addAttribute("users" ,l);
        return "list";
    }

    @RequestMapping(path="/createUser",method = RequestMethod.POST)
    public String createOrUpdate(User usr){
        service.createOrUpdate(usr);
        return "redirect:/list";
    }

    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String getEmployeeById(Model model, @PathVariable("id") Optional<Long> idop) throws Exception{
        if(idop.isPresent()){
            User usr = service.getEmployeeById(idop.get());
            model.addAttribute("user", usr);
        }else{
            model.addAttribute("user", new User());
        }
        return "add-edit";
    }

    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) throws Exception{
        service.deleteUserById(id);
        return "redirect:/list";
    }
}
