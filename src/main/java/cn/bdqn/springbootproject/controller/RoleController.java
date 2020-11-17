package cn.bdqn.springbootproject.controller;

import cn.bdqn.springbootproject.dao.RoleDao;
import cn.bdqn.springbootproject.entity.Role;
import cn.bdqn.springbootproject.service.RoleService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class RoleController {
    @Resource
    private RoleService rser;
    @RequestMapping("/roleIndex")
    public String roleIndex(Model m){
        m.addAttribute("msg","hello");
        Role role = new Role(100,"guanliyuan","管理员",12,new Date());
        m.addAttribute("role",role);
        List<Role> list = new ArrayList<Role>();
        list.add(new Role(101,"guanliyuan","管理员",12,new Date()));
        list.add(new Role(102,"jingli","经理",12,new Date()));
        list.add(new Role(103,"caiwu","财务",12,new Date()));
        m.addAttribute("list",list);
        return"RoleIndex";
    }

    @RequestMapping("/getAllRole")
    public String getAllRole(Model m){
        List<Role> list = rser.findAllRole();
        m.addAttribute("roleList",list);
        return "allRole";
    }

    @RequestMapping("/showRole")
    public String updateRole(Integer id){
        int rel=rser.updateRole(id,"员工");
        System.out.println(rel==1?"修改成功":"修改失败");
        return "allRole";
    }
}
