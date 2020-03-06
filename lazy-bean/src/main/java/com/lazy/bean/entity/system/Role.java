package com.lazy.bean.entity.system;

import com.lazy.bean.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity(name="t_sys_role")
@Table(appliesTo = "t_sys_role",comment = "角色")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Role extends BaseEntity {


    @Column(name = "name",columnDefinition = "VARCHAR(256) NOT NULL COMMENT '角色名称'")
    private String name;
}
