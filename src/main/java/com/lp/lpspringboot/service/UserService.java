package com.lp.lpspringboot.service;

import com.lp.lpspringboot.mysql.model.User;
import com.lp.lpspringboot.mysql.repository.MySQLUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: lp-springboot
 * @BelongsPackage: com.lp.lpspringboot.service
 * @Author: lp
 * @CreateTime: 2023-08-07  10:22
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class UserService {

    private final MySQLUserRepository userRepository ;

    @Autowired
    public UserService(MySQLUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        List<User> all = userRepository.findAll();
        return   all;
    }

}
