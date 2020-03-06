package com.lazy.service.system;

import com.lazy.bean.entity.system.Menu;
import com.lazy.dao.system.MenuRepository;
import com.lazy.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService extends BaseService<Menu,Long, MenuRepository> {

    @Autowired
    private MenuRepository menuRepository;
}
