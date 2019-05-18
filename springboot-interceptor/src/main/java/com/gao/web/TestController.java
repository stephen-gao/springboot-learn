package com.gao.web;

import com.gao.entity.User;
import com.gao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("login/{name}")
    public String login(@PathVariable String name){
        User user = userService.getUserByUsername(name);
        return "hi " + user.getUsername() + " your" +
                "<br/> id is "+ user.getId() +
                "<br/> token is "+ user.getToken();
    }

    @GetMapping("id/{id}")
    public String getUserById(@PathVariable String id){
        User user = userService.getUserById(id);
        return "hi " + user.getId() + " your name is "+ user.getUsername();
    }


    @GetMapping("/noAuthority")
    public String noAuthority(){
        return "you have no Authority";
    }

    @GetMapping("name/{name}")
    public String index(@PathVariable String name){
        User user = userService.getUserByUsername(name);
        return "hi " + user.getUsername() + " your" +
                "<br/> id is "+ user.getId() +
                "<br/> token is "+ user.getToken();
    }
}
