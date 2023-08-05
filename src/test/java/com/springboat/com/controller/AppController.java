/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboat.com.controller;

import com.springboat.com.config.BaseResponse;
import com.springboat.com.pojo.User;
import com.springboat.com.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author taofeek
 */

@RestController
@RequestMapping("/api")
public class AppController {
    
    @Autowired
    AppService appService;
    
    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public ResponseEntity<?> createCategory(@RequestBody User user) {
        System.out.println("Hello");
        BaseResponse responseData = appService.userSignup(user);
        HttpStatus httpStatus = (responseData.getStatusCode() == 200 ) ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
        return new ResponseEntity<>(responseData, httpStatus);
    }
    
    
    
    
}
