package com.lp.lpspringboot.mysql.model;





import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @BelongsProject: lp-springboot
 * @BelongsPackage: com.lp.lpspringboot.mysql.model
 * @Author: lp
 * @CreateTime: 2023-08-07  10:27
 * @Description: TODO
 * @Version: 1.0
 */
@Entity
@Data
public class User {

    private String  name;
    @Id
    private Long id;




}
