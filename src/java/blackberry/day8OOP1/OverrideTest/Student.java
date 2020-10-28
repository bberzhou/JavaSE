package blackberry.day8OOP1.OverrideTest;

/**
 * @Description: 学生类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 21:23
 * Create By IntelliJ IDEA
 */
public class Student extends Person {
    String major;

    //  无参的构造器
    public Student () {

    }

    public Student (String major) {
        this.major = major;
    }

    @Override
    public void eat () {
        System.out.println ("不吃饭");
    }

    public void study () {
        System.out.println ("学习的专业是:" + major);
    }

    //  这里方法名和形参列表都和父类中的相同，但是并不认为是一个方法重写
    public void show () {
        System.out.println ("我是一个学生");
    }

    //  测试重写方法的返回值类型,此时子类返回值类型设置为String类型也是可以的
    public String info () {
        return null;
    }
}
