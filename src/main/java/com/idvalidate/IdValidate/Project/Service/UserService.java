package com.idvalidate.IdValidate.Project.Service;

import com.idvalidate.IdValidate.Project.DAO.UserEntity;
import com.idvalidate.IdValidate.Project.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepo repository;

    public List<UserEntity> getUsers(){
        return (List<UserEntity>)  repository.findAll();
    }

    public void register(UserEntity userDetails){
        UserEntity user = UserEntity.builder()
                .id(userDetails.getId())
                .firstName(userDetails.getFirstName())
                .lastName(userDetails.getLastName())
                .address(userDetails.getAddress())
                .email(userDetails.getEmail())
                .password(userDetails.getPassword())
                .build();

        repository.save(user);

    }
}
