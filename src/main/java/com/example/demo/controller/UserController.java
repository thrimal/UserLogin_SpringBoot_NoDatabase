package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Thrimal Avishka <thrimalavishka99@gmail.com>
 * @since 24-Feb-23
 */
@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> addUser(@RequestBody UserDTO userDTO){
        try {
            boolean b = userService.addUser(userDTO);
            return new ResponseEntity<>(b, HttpStatus.CREATED);

        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(params = {"userName","password"})
    public ResponseEntity getUser(@RequestParam String userName, @RequestParam String password){
        try {
            UserDTO user = userService.getUser(userName, password);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
}
