/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboat.com.config;

import lombok.Data;

/**
 *
 * @author taofeek
 */

@Data
public class BaseResponse {
    
    private String statusMsg;
    
    private int statusCode;
    
    private Object Data;
    
}
