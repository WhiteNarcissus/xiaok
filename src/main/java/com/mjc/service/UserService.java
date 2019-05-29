package com.mjc.service;



import com.mjc.domain.User;

import java.util.List;

/**
 * Created by gcb on 2019/2/27.
 */
public interface UserService {

   User selectOne(User u);

   List<User> selectAll();
}
