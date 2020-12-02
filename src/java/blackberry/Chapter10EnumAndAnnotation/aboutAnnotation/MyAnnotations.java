package blackberry.Chapter10EnumAndAnnotation.aboutAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 12/2/20 11:26
 * Create By IntelliJ IDEA
 */
@Retention (RetentionPolicy.RUNTIME)
public @interface MyAnnotations {
    MyAnnotation[] value();
}
