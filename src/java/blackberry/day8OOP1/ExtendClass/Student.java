package blackberry.day8OOP1.ExtendClass;

/**
 * @Description: 学生类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 10:38
 * Create By IntelliJ IDEA
 */
public class Student extends Person {
    //  这两个属性可以通过集成Person类来获得
//    String name;
//    int age;
    String major;

    public Student () {

    }

    public Student (String name, int age, String major) {
        this.age = age;
        this.name = name;
        this.major = major;
    }

    public void eat () {
        System.out.println ("吃饭");
    }

    public void sleep () {
        System.out.println ("睡觉");
    }

    public void studying () {
        System.out.println ("学习");
    }
}
