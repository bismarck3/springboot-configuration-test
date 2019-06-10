/**
 * @projectName springAnnotationTest
 * @package com.wangjing.test
 * @className com.wangjing.test.MainTest
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.test;

import com.wangjing.test.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * MainTest
 *
 * @description main入口类
 * @author wangjing
 * @date 2019/6/5 11:21
 * @version v1.0.0
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationTest.class);
        User user = context.getBean(User.class);
        System.out.println(user);
        context.close();
    }

}
