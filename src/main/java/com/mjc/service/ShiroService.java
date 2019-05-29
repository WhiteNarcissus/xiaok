package com.mjc.service;



import com.mjc.domain.Role;
import com.mjc.domain.User;
import org.apache.shiro.subject.Subject;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created by gcb on 2019/1/3.
 */
public interface ShiroService  {

    User selectOne(User u);

    Role curRole(User user);

   void putAuth2Redis(Subject subject, User user);

}
