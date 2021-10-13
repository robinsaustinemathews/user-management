package com.robins.usermanagement.repository;

import com.robins.usermanagement.entity.User;

public interface UserRespository {

    boolean create(User user);
    boolean modify(User user);
    boolean delete(User user);

}
