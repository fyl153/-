package cn.bdqn.springbootproject.service;

import cn.bdqn.springbootproject.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleService {
    List<Role> findAllRole();
    int updateRole(@Param("id") Integer id, @Param("roleName") String roleName);
}
