package com.gao.web;

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

    @GetMapping("index/{name}")
    public String index(@PathVariable String name){
        return "hi " + name + " !";
    }
}
