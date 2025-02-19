package com.huytq.learningJavaStep.service;

import com.huytq.learningJavaStep.dto.request.UserCreationRequest;
import com.huytq.learningJavaStep.entity.User;
import com.huytq.learningJavaStep.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest user){
        User userEntity = new User();
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setBirthday(user.getBirthday());
        return userRepository.save(userEntity);
    }
}
