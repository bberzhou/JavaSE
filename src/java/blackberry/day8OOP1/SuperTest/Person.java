package blackberry.day8OOP1.SuperTest;

/**
 * @Description: 人类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 23:27
 * Create By IntelliJ IDEA
 */
public class Person {
    String name;
    int age;

    int id = 1001; //  身份证号

    //  无参的构造器
    public Person () {
        System.out.println ("我是空参构造器");
    }

    //  带一个参数的构造器
    public Person (String name) {
        this.name = name;
    }

    //  带两个个参数的构造器
    public Person (String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void eat () {
        System.out.println ("人：吃饭");
    }

    public void walk () {
        System.out.println ("人：走路");
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public String getName () {
        return name;
    }

    public void setAge (int age) {
        this.age = age;
    }
}
