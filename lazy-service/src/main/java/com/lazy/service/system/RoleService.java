package com.lazy.service.system;

import com.lazy.bean.entity.system.Role;
import com.lazy.dao.system.RoleRepository;
import com.lazy.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends BaseService<Role, Long, RoleRepository> {

    @Autowired
    private RoleRepository roleRepository;
}
