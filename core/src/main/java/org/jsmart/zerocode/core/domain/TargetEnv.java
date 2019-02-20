package org.jsmart.zerocode.core.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
/*
* @Description: 环境配置文件注释
* @author: aries
* @date: 2019-02-20 10:58
* @email: zbl686868@126.com
* @phone: 17611305537
*/
public @interface TargetEnv {
    String value();
}
