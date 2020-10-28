package blackberry.day8OOP1.ExtendClass;

/**
 * @Description: 继承性
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 10:33
 * Create By IntelliJ IDEA
 */
public class Person {
    String name;
    int age;

    public Person () {

    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void eat () {
        System.out.println ("吃饭");
    }

    public void sleep () {
        System.out.println ("睡觉");

    }
}
