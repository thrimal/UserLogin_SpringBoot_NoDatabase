package com.example.demo.service;

import com.example.demo.dto.UserDTO;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 24-Feb-23
 */
public interface UserService {
    boolean addUser(UserDTO user);
    UserDTO getUser(String username, String password);
}
