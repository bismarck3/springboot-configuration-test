/**
 * @projectName springAnnotationTest
 * @package com.wangjing.test
 * @className com.wangjing.test.entity.User
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.test.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * User
 *
 * @description 用户
 * @author wangjing
 * @date 2019/6/5 11:24
 * @version v1.0.0
 */
public class User {

    private String name;

    private Integer age;

    private Date birth;

    public User(){
        System.out.println("用户初始化");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void start() {
        System.out.println("TestBean 初始化。。。");
    }

    public void destroy() {
        System.out.println("TestBean 销毁。。。");
    }
}
