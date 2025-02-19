package com.huytq.learningJavaStep.controller;

import com.huytq.learningJavaStep.dto.request.UserCreationRequest;
import com.huytq.learningJavaStep.entity.User;
import com.huytq.learningJavaStep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest userCreationRequest){
        return userService.createUser(userCreationRequest);
    }
}
