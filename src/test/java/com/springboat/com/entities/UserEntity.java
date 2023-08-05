/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboat.com.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboat.com.pojo.User;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author taofeek
 */

@Entity
@Data
@Table
public class UserEntity implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;
    
    private String username;
    
    private String fullname;
    
    private String password;
    
    public UserEntity() {
        
    }    
    
    public UserEntity(User user){
        this.id = user.getId();
        this.fullname = user.getFullname();
        this.username = user.getUsername();
        this.password = user.getPassword();
    }
}
