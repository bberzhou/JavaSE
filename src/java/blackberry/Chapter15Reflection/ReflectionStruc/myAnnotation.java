package blackberry.Chapter15Reflection.ReflectionStruc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/11/21 22:00
 * Create By IntelliJ IDEA
 */

//  自定义注解：
@Target ({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE})
@Retention (RetentionPolicy.RUNTIME)

//@Retention (RetentionPolicy.CLASS)      //  如果这里改成CLASS，在MethodTest类里面的test2就不能获取到Pop类里面方法的注解信息
public @interface myAnnotation {
    String value() default "hello";

}
