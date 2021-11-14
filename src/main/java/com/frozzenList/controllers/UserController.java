package com.frozzenList.controllers;

import com.frozzenList.exceptions.UserNotFoundException;
import com.frozzenList.models.User;
import com.frozzenList.responetories.UserRepo;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {

    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    public List<User> allUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> userById(@PathVariable Long id) {
        User user = userRepo.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return EntityModel.of(user,
                linkTo(methodOn(UserController.class).userById(id)).withSelfRel(),
                linkTo(methodOn(UserController.class).allUsers().sel))
    }


}
