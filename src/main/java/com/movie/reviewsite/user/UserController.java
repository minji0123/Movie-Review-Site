package com.movie.reviewsite.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class UserController {

    @Autowired
    private UserService userService;

    // sign up view page
    @GetMapping
    public String signup() {
        return "signup";
    }

    // sign up process
    @PostMapping
    public String signupProcess(@ModelAttribute UserDto userDto) {
        userService.signup(userDto);
        return "redirect:/signin";
    }
}
