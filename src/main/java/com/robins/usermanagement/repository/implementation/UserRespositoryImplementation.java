package com.robins.usermanagement.repository.implementation;

import com.robins.usermanagement.entity.User;
import com.robins.usermanagement.repository.UserRespository;

public class UserRespositoryImplementation implements UserRespository {
    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public boolean modify(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }
}
