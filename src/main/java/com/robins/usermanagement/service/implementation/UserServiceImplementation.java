package com.robins.usermanagement.service.implementation;

import com.robins.usermanagement.entity.User;
import com.robins.usermanagement.repository.UserRespository;
import com.robins.usermanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRespository userRespository;

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
