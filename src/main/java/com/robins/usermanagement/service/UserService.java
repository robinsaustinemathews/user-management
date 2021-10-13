package com.robins.usermanagement.service;

import com.robins.usermanagement.entity.User;

public interface UserService {

    boolean create(User user);
    boolean modify(User user);
    boolean delete(User user);

}
