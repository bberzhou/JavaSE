package blackberry.day8OOP1.PolymorphicExecise;

/**
 * @Description: 学生类
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 22:23
 * Create By IntelliJ IDEA
 */
public class Student extends Person {
    protected String school = "PKU";

    @Override
    public String getInfo () {
        return "Name：" + name + "\t" + "age:" + age + "\t" + "school：" + school;
    }
}
