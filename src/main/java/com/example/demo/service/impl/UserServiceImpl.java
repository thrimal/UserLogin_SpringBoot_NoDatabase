package com.example.demo.service.impl;

import com.example.demo.database.Database;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 24-Feb-23
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Database database;

    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean addUser(UserDTO userDTO) {
//        System.out.println(userDTO);
        return database.addUsers(mapper.map(userDTO,User.class));
    }

    @Override
    public UserDTO getUser(String userName, String password) {
        User user = database.getUser(userName, password);
        return mapper.map(user, UserDTO.class);
    }
}
