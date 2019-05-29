package com.mjc.mapper;



import com.mjc.domain.Permission;
import com.mjc.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PermissionMapper extends TkMapper<Permission> {

    List<Permission> queryRolePermissionByUser(User user);

}