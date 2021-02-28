package com.example.registrationservice.services.impl;

import com.example.registrationservice.dto.UserForm;
import com.example.registrationservice.entities.User;
import com.example.registrationservice.mappers.UserFormToUserMapper;
import com.example.registrationservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserFormToUserMapper userFormToUserMapper;

    @Override
    public void saveUser(UserForm userForm) {
        User user = userFormToUserMapper.mapUserFormToUser(userForm);
        System.out.println(user.getName());
        System.out.println(user.getSurname());
    }

}
