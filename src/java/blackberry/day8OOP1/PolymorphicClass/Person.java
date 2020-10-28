package blackberry.day8OOP1.PolymorphicClass;

/**
 * @Description: 人类
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 00:01
 * Create By IntelliJ IDEA
 */
public class Person {
    /*
        多态性
     */
    String name;
    int id = 1001;
    int age;

    public void eat () {
        System.out.println ("人：吃饭");
    }

    public void walk () {
        System.out.println ("人：走路");
    }
}
