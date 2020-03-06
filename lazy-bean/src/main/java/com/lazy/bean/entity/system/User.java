package com.lazy.bean.entity.system;

import com.lazy.bean.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity(name="t_sys_user")
@Table(appliesTo = "t_sys_user",comment = "用户")
@Data
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity  {

    @Column(name = "name",columnDefinition = "VARCHAR(256) NOT NULL COMMENT '用户名称'")
    private String name;

    @Column(name = "account",columnDefinition = "VARCHAR(256) COMMENT '登录账号'")
    private String account;

    @Column(name = "salt",columnDefinition = "VARCHAR(256) COMMENT '加盐'")
    private String salt;

    @Column(name = "password",columnDefinition = "VARCHAR(256) NOT NULL COMMENT '用户名称'")
    private String password;

    @Column(name = "role_id",columnDefinition = "bigint NOT NULL COMMENT '角色编号'")
    private Long roleId;


}
