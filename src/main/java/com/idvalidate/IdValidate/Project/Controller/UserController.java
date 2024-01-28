package com.idvalidate.IdValidate.Project.Controller;

import com.idvalidate.IdValidate.Project.DAO.UserEntity;
import com.idvalidate.IdValidate.Project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/register")
    public void registerUser(@RequestBody UserEntity user){
        service.register(user);
    }

    @GetMapping("/users")
    public List<UserEntity> getAllUsers(){return service.getUsers(); }


}
