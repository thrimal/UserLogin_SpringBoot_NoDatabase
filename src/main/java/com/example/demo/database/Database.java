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
        for (User u : users) {
            if(u.getPassword()==password || userName==u.getUserName()){
                return u;
            }
            userEntity=u;
        }
        return userEntity;
    }
}
