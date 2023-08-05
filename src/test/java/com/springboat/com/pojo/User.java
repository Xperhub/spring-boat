/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboat.com.pojo;

import com.springboat.com.entities.UserEntity;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author taofeek
 */

@Data
public class User implements Serializable {
    private Long id;
    
    private String username;
    
    private String fullname;
    
    private String password;
    
    
    public User(){
        
    }
    public User(UserEntity userEntity){
        this.id = userEntity.getId();
        this.username = userEntity.getUsername();
        this.fullname = userEntity.getFullname();
        this.password = userEntity.getPassword();
    }
}
