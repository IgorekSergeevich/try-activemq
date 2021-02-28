package com.example.registrationservice.mappers;


import com.example.registrationservice.dto.UserForm;
import com.example.registrationservice.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserFormToUserMapper {

    User mapUserFormToUser(UserForm userForm);

}
