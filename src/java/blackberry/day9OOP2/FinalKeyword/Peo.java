package blackberry.day9OOP2.FinalKeyword;

/**
 * @Description: peo类型
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 15:02
 * Create By IntelliJ IDEA
 */
public class Peo {
    private int age;
    private String name;
    private final int NUM = 20;

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public String getName () {
        return name;
    }

    public int getNUM () {
        return NUM;
    }

    //  定义一个final修饰的局部变量的方法
    public int Som (final int num) {
        return num + 1;
    }
}
