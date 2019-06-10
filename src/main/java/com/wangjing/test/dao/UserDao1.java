/**
 * @projectName springAnnotationTest
 * @package com.wangjing.test.dao
 * @className com.wangjing.test.dao.UserDao1
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.test.dao;

import org.springframework.stereotype.Service;

/**
 * UserDao1
 *
 * @description 用户dao实现1
 * @author wangjing
 * @date 2019/6/5 15:51
 * @version v1.0.0
 */
@Service("userDao1")
public class UserDao1 implements IUserDao {

    public UserDao1(){
        System.out.println("userDao1");
    }

    @Override public void hello() {
        System.out.println("in userDao1");
    }
}
