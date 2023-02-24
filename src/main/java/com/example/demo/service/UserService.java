package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 24-Feb-23
 */
public interface UserService {
    public boolean addUser(UserDTO user);
    public UserDTO getUser(String username, String password);
}
