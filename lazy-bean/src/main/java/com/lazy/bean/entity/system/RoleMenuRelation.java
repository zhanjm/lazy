package com.lazy.bean.entity.system;


import com.lazy.bean.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity(name = "t_sys_rmrelation")
@Table(appliesTo = "t_sys_rmrelation", comment = "角色菜单关系")
@Data
@EntityListeners(AuditingEntityListener.class)
public class RoleMenuRelation extends BaseEntity {
    @Column(name = "role_id",columnDefinition = "bigint NOT NULL COMMENT '角色编号'")
    private Long roleId;
    @Column(name = "menu_id",columnDefinition = "bigint NOT NULL COMMENT '菜单编号'")
    private Long menuId;
}
