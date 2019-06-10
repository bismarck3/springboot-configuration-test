/**
 * @projectName springAnnotationTest
 * @package com.wangjing.test.selector
 * @className com.wangjing.test.selector.MyImportSelector
 * @copyright Copyright 2019 Thuisoft, Inc. All rights reserved.
 */
package com.wangjing.test.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyImportSelector
 *
 * @description 自定义importSelector
 * @author wangjing
 * @date 2019/6/5 15:32
 * @version v1.0.0
 */
public class MyImportSelector implements ImportSelector {
    @Override public String[] selectImports(AnnotationMetadata annotationMetadata) {
        annotationMetadata.getClassName();
        return new String[0];
    }
}
