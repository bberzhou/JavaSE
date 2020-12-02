package blackberry.Chapter10EnumAndAnnotation.aboutAnnotation;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 12/2/20 11:23
 * Create By IntelliJ IDEA
 */

//  JDK 8之前的多个注解,用一个数组
//@MyAnnotations ({@MyAnnotation(value = "hi"),@MyAnnotation(value = "hello")})
    //  现在也可以采取这样写


@MyAnnotation(value = "hell")
@MyAnnotation(value = "ggg")
public class Person {
    private String name;
    private int age;

    public Person () {

    }
}
