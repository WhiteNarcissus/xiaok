package com.mjc.service.impl;

import com.mjc.domain.User;
import com.mjc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gcb on 2019/5/29.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public User selectOne(User u) {
        return null;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }
}
