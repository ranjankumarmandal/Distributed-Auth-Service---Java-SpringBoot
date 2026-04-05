package com.ranjankumarmandal.auth_service.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String password;
}
