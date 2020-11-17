package cn.bdqn.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
    @RequestMapping("/userIndex")
    public  String index(Model model)
    {
        model.addAttribute("msg","<h2>第一个thymeleaf</h2>");
        return "RoleIndex";//视图逻辑名
    }
}
