package com.example.demo.database;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 24-Feb-23
 */
@Component
public class Database {
    private ArrayList<User> users = new ArrayList<User>();
    private User userEntity;

    public ArrayList<User> getUsers() {
        System.out.println(users);
        return users;
    }

    public boolean addUsers(User user) {
        System.out.println(user);
        boolean b = users.add(user);
        System.out.println(users);
        return b;
    }

    public User getUser(String userName, String password){
        for (User user : users) {
//            if (user.getUserName()==userName && user.getPassword()==password) {
//                userEntity=user;
//                System.out.println(userEntity);
//            }
            System.out.println(userName+""+password);
            System.out.println(user.getUserName()+""+user.getPassword());
        }
        System.out.println(userEntity);
        return userEntity;
    }
}
