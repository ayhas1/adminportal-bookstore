package com.adminportal.service;

import com.adminportal.model.User;
import com.adminportal.security.UserRole;


import java.util.Set;


public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);

    User save(User user);
}
