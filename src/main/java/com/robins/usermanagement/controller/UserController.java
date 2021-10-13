package com.robins.usermanagement.controller;

import com.robins.usermanagement.entity.User;
import com.robins.usermanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    enum Status{
        CREATED,
        MODIFIED,
        DELETED,
        SYSTEM_ERROR
    }

    @PostMapping
    public String create(@RequestBody User user){
        if(userService.create(user))
            return Status.CREATED.name();
        else
            return Status.SYSTEM_ERROR.name();
    }

    @PostMapping
    public String modify(@RequestBody User user){
        if(userService.modify(user))
            return Status.MODIFIED.name();
        else
            return Status.SYSTEM_ERROR.name();
    }

    //TODO : Implement
    @GetMapping
    public User get(@RequestBody String lastName){
        return null;
    }

    @DeleteMapping
    public String delete(@RequestBody User user){
        if(userService.delete(user))
            return Status.DELETED.name();
        else
            return Status.SYSTEM_ERROR.name();
    }

}
