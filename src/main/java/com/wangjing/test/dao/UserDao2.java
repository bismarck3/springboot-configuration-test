/**
 * @projectName springAnnotationTest
 * @package com.wangjing.test.dao
 * @className com.wangjing.test.dao.UserDao2
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.test.dao;

import org.springframework.stereotype.Service;

/**
 * UserDao2
 *
 * @description 用户dao实现2
 * @author wangjing
 * @date 2019/6/5 15:52
 * @version v1.0.0
 */
@Service("userDao2")
public class UserDao2 implements IUserDao {
    public UserDao2(){
        System.out.println("userDao2");
    }

    @Override public void hello() {
        System.out.println("in userDao2");
    }
}
