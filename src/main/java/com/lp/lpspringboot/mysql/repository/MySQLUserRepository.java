package com.lp.lpspringboot.mysql.repository;

import com.lp.lpspringboot.mysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @BelongsProject: lp-springboot
 * @BelongsPackage: com.lp.lpspringboot.mysql.repository
 * @Author: lp
 * @CreateTime: 2023-08-07  10:35
 * @Description: TODO
 * @Version: 1.0
 */


public interface MySQLUserRepository extends JpaRepository<User, Long> {


}

