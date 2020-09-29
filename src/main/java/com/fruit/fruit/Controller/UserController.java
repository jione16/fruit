package com.fruit.fruit.Controller;

import com.fruit.fruit.Entity.User;
import com.fruit.fruit.Service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "user")
public class UserController {
    UserService userService;
    PasswordEncoder passwordEncoder;

    UserController(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public Object register(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.getAllErrors();
        } else {
            try {
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                return userService.register(user);
            } catch (Exception exception) {
                return exception;
            }
        }
    }
}
