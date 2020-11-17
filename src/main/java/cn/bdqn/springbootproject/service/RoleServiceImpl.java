package cn.bdqn.springbootproject.service;

import cn.bdqn.springbootproject.dao.RoleDao;
import cn.bdqn.springbootproject.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    @Resource
    private RoleDao rdao;
    @Override
    public int updateRole(Integer id, String roleName) {
        return rdao.updateRole(id, roleName);
    }

    @Override
    public List<Role> findAllRole() {
        return rdao.findAllRole();
    }
}
