package cn.bdqn.springbootproject.dao;

import cn.bdqn.springbootproject.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface RoleDao {
    List<Role> findAllRole();
    int updateRole(@Param("id") Integer id, @Param("roleName") String roleName, @Param("modifyDate")Date modifyDate);
    int updateRole1(Role role);
    Role findRole(Integer id);
}
