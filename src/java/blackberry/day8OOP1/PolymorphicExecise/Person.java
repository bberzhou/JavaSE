package blackberry.day8OOP1.PolymorphicExecise;

/**
 * @Description: 人类
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 22:22
 * Create By IntelliJ IDEA
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo () {
        return "Name：" + name + "\t" + "age:" + age;
    }

}
