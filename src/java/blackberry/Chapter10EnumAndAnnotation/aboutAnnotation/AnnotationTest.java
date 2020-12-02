package blackberry.Chapter10EnumAndAnnotation.aboutAnnotation;

import java.lang.annotation.Annotation;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 12/2/20 10:28
 * Create By IntelliJ IDEA
 */
public class AnnotationTest {
    /**
     *
     */

    public static void main (String[] args) {

        @SuppressWarnings ("unused")
        int m =10;  //  编译器就不会报警告

        //  通过反射获取注解信息------到反射内容时系统讲解
        Class<MyAnnotation> clazz = MyAnnotation.class;
        Annotation[] annotations = clazz.getAnnotations ();
        for (int i = 0 ; i < annotations.length ; i++) {
            System.out.println (annotations[i]);
        }
        //@java.lang.annotation.Inherited()
        //@java.lang.annotation.Retention(value=RUNTIME)

    }
}
