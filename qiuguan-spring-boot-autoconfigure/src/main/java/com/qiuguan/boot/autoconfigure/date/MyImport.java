package com.qiuguan.boot.autoconfigure.date;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: qiuguan
 * date: 2022/1/12 - 上午12:54
 *
 * @see org.springframework.context.annotation.ImportBeanDefinitionRegistrar
 */
public class MyImport implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{DateAutoConfiguration.class.getName()};
    }
}
