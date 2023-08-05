/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboat.com.dto;

import com.springboat.com.pojo.User;
import lombok.Data;

/**
 *
 * @author taofeek
 */

@Data
public class UserDto {
    
    private Long Id;
    
    private String fullname;
    
    private String username;
    
    public UserDto(User user){
        this.Id = user.getId();
        this.fullname = user.getFullname();
        this.username = user.getUsername();
    }
}
