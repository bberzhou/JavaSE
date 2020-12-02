package blackberry.Chapter10EnumAndAnnotation.ClassEnum;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/30/20 21:29
 * Create By IntelliJ IDEA
 */
public class defineEnumClass1Test {
    /**
     *  自定义枚举类的测试
     *
     */
    public static void main (String[] args) {
        defineEnumClass1 spring = defineEnumClass1.SPRING;
        System.out.println(spring); //  defineEnumClass{seasonName='Spring', seasonDesc='春暖花开'}

        System.out.println(spring.getSeasonName ());    //  调用get方法输出Name:Spring
    }
}
