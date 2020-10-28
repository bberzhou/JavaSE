package blackberry.day8OOP1.SuperTest;

/**
 * @Description: 学生类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 23:33
 * Create By IntelliJ IDEA
 */
public class Student extends Person {
    String major;
    //  子类和父类中存在了相同的属性
    int id = 1002;    //  学生的学号

    public Student () {
        //  在子类的构造器中默认有一个super()方法

    }

    //  构造器
    public Student (String major) {
//        super();
        this.major = major;
    }

    //  带三个参数的构造器
    public Student (String name, int age, String major) {
        //  当父类的属性改为private的时候，就不能直接调用属性，就需要使用父类的构造器
//        super.name = name;
//        super.age = age;
//        this.name = name;
        super (name, age);
        this.major = major;
    }

    @Override
    public void eat () {
        System.out.println ("学生吃有营养的食物");
    }

    public void study () {
        System.out.println ("学生学习知识");
        //  默认前面就是有一个this
        super.eat ();
    }

    //  使用super关键字
    public void show () {
        System.out.println ("name=" + this.name + ",age" + super.age + ",major:" + this.major);
        System.out.println ("id= " + id);
        System.out.println ("super  id = " + super.id);
    }
}
