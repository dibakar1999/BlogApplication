package com.Blog.Application.Services;

import com.Blog.Application.Payloads.UserDTO;

import java.util.List;

public interface UserServices {
    UserDTO CreateUser(UserDTO user);
    UserDTO updateUser(UserDTO user, Integer userId);
    UserDTO getUserById(Integer userId);
    List<UserDTO>getAllUsers();
    void deleteUser(Integer userId);
}
