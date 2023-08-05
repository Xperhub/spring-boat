/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboat.com.service;

import com.springboat.com.config.BaseResponse;
import com.springboat.com.dto.UserDto;
import com.springboat.com.entities.UserEntity;
import com.springboat.com.pojo.User;
import com.springboat.com.repository.userRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author taofeek
 *
 */
@Service
public class AppService {

    @Autowired
    userRepository userRepo;

    BaseResponse baseResponse = new BaseResponse();

    public BaseResponse userSignup(User user) {
        baseResponse.setStatusCode(404);
        baseResponse.setStatusMsg("FAILED REQUEST");

        try {

            UserEntity userEntity = new UserEntity(user);

            String username = userEntity.getUsername();

            Optional<UserEntity> isUser = userRepo.findByUsername(username);

            if (isUser.isPresent()) {
                baseResponse.setStatusMsg("User Already Exist");
                baseResponse.setStatusCode(400);
            }
            
            
            UserDto userDto = new UserDto(user);
            
            userRepo.save(userEntity);
            baseResponse.setData(userDto);
            baseResponse.setStatusCode(200);
            baseResponse.setStatusMsg("Successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return baseResponse;
    }

}
