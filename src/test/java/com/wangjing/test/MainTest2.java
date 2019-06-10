/**
 * @projectName springAnnotationTest
 * @package com.wangjing.test
 * @className com.wangjing.test.MainTest2
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.test;

import com.wangjing.test.entity.User;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * MainTest2
 *
 * @description 测试
 * @author wangjing
 * @date 2019/6/5 18:10
 * @version v1.0.0
 */
public class MainTest2 {

    @Test
    public void test(){
        Field[] fields = User.class.getDeclaredFields();
        for(Field filed :fields){
            String type = filed.getType().getSimpleName();
            System.out.println(type);
        }
    }
}
