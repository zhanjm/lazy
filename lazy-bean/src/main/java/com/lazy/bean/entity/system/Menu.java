package com.lazy.bean.entity.system;

import com.lazy.bean.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity(name="t_sys_menu")
@Table(appliesTo = "t_sys_menu",comment = "菜单")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Menu extends BaseEntity {
    @Column(name = "name",columnDefinition = "VARCHAR(256) NOT NULL COMMENT '菜单名称'")
    private String name;

    @Column(name = "uri",columnDefinition = "VARCHAR(256) NOT NULL COMMENT '菜单地址'")
    private String uri;

    @Column(name = "pid",columnDefinition = "bigint NOT NULL COMMENT '上级菜单标识'")
    private String pid;
}
