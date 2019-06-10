/**
 * @projectName springAnnotationTest
 * @package com.wangjing.test.register
 * @className com.wangjing.test.register.MyImportBeanDefinitionRegester
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.test.register;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyImportBeanDefinitionRegester
 *
 * @description 自定义import注册
 * @author wangjing
 * @date 2019/6/5 15:14
 * @version v1.0.0
 */
public class MyImportBeanDefinitionRegester implements ImportBeanDefinitionRegistrar {
    @Override public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
        BeanDefinitionRegistry beanDefinitionRegistry) {

    }
}
