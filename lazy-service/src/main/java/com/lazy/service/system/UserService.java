package com.lazy.service.system;

import com.lazy.bean.entity.system.User;
import com.lazy.dao.system.UserRepository;
import com.lazy.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User,Long, UserRepository> {
    @Autowired
    private UserRepository userRepository;
}
