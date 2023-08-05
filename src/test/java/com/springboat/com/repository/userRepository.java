/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springboat.com.repository;

import com.springboat.com.entities.UserEntity;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author taofeek
 */
public interface userRepository extends CrudRepository<UserEntity, Long> {
  
    Optional<UserEntity> findByUsername(String Username);
}
