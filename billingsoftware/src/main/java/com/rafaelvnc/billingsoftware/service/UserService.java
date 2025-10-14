package com.rafaelvnc.billingsoftware.service;

import com.rafaelvnc.billingsoftware.io.UserRequest;
import com.rafaelvnc.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
