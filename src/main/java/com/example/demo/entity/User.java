package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 24-Feb-23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
    private String userName;
    private String password;
}
