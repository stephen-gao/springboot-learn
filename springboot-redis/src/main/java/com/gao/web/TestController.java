package com.gao.web;

import com.gao.entity.User;
import com.gao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author gao
 * @Date created time 2019/5/11 10:45
 * @Description
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private IUserService userService;

    @GetMapping("index/{name}")
    public String index(@PathVariable String name){
        User user = userService.getUserByUsername(name);
        return "hi " + user.getUsername() + " your id is "+ user.getId();
    }

    @GetMapping("id/{id}")
    public String getUserById(@PathVariable String id){
        User user = userService.getUserById(id);
        return "hi " + user.getUsername() + " your id is "+ user.getId();
    }
}
