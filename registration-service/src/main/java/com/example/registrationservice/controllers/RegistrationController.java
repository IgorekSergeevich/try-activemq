package com.example.registrationservice.controllers;

import com.example.registrationservice.dto.UserForm;
import com.example.registrationservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class RegistrationController {

    private final UserService userService;

    @GetMapping
    public ModelAndView getRegistrationForm() {
        return new ModelAndView("registration-form", "userForm", new UserForm());
    }

    @PostMapping
    public ModelAndView register(@ModelAttribute UserForm userForm) {
        userService.saveUser(userForm);
        return new ModelAndView("registration-form", "userForm", new UserForm());
    }

}
