package spring.study.oauthresource.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.study.oauthresource.entity.User;
import spring.study.oauthresource.repository.UserRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<User> finaAllUser(){
        return userRepository.findAll();
    }
}
