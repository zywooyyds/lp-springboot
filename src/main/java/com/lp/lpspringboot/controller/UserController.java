package com.lp.lpspringboot.controller;

import com.lp.lpspringboot.mysql.model.User;
import com.lp.lpspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: lp-springboot
 * @BelongsPackage: com.lp.lpspringboot.controller
 * @Author: lp
 * @CreateTime: 2023-08-07  10:44
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

   @Autowired
    private UserService  userService;
    @GetMapping("/mysql")
    public List<User> getAllMySQLUsers() {
        return
                userService.findAll();
    }


}
