package com.example.springsecurity.service;

import com.example.springsecurity.dto.LoginRequest;
import com.example.springsecurity.dto.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest request);
}
