package blackberry.day8OOP1.OverrideTest;

/**
 * @Description: 人类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 21:19
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

    public void eat () {
        System.out.println ("吃饭");
    }

    public void walk (int distance) {
        System.out.println ("走路,走了" + distance + " 公里。");
        //  在walk方法中调用show()方法
        show ();
        //  在walk中调用eat()方法,
        eat ();
    }

    private void show () {
        System.out.println ("我是一个人");
    }

    //  测试重写方法的返回值类型
    public Object info () {
        return null;
    }
}
