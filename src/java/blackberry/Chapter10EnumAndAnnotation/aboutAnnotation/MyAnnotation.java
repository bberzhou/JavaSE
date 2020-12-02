package blackberry.Chapter10EnumAndAnnotation.aboutAnnotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 12/2/20 10:40
 * Create By IntelliJ IDEA
 */

@Inherited
@Repeatable (MyAnnotations.class)  //   表示注解可重复的
@Retention (RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    /**
     *  自定义注解
     *
     *   在类名前面加上 ：@interface
     *
     */
//    String value(); //  注解的属性，一个参数
//    String[] value();   //  多个参数的情况
    String value() default "hello";       // 还可以指定默认值
}
