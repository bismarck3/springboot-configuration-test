/**
 * @projectName springAnnotationTest
 * @package com.wangjing.test
 * @className com.wangjing.test.ApplicationTest
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.test;

import com.wangjing.test.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * ApplicationTest
 *
 * @description 测试spirngBoot注解的入口类
 * @author wangjing
 * @date 2019/6/5 11:14
 * @version v1.0.0
 */
@Configuration
//@Import(User.class)
public class ApplicationTest {

    public ApplicationTest(){
        System.out.println("容器初始化");
    }

    //    @Bean(name = "myTest", initMethod = "start", destroyMethod = "destroy")
    ////    @Scope("singleton")
    //    @Scope("prototype")
    //    public User user(){
    //        return new User();
    //    }
}
