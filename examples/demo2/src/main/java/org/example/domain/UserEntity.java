package org.example.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

/**
 * @author Jack Li
 * @date 2022/1/3 9:49 下午
 * @description
 */
@Data
@Entity(name = "t_user")
public class UserEntity extends BaseEntity {

   private String name;
   private Integer age;
   private Date birthday;

}
