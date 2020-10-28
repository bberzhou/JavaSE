package blackberry.day7OOP1.Exc;

/**
 * @Description: PeronClass
 * @author: bberzhou@gmail.com
 * @date: 4/8/20 10:08
 * Create By IntelliJ IDEA
 */
public class Person {
    /*
        创建一个Person类的对象，设置该对象的name、age、和sex的属性，
        调用study（）方法，输出字符串"studying"，
        调用showAge（）方法显示age的值，
        调用addAge（）方法给对象的age属性值增加2岁
        在Test类中进行测试
     */

    String name;
    int age;
    int sex;

    public void study () {
        System.out.println ("studying");
    }

    public void showAge () {
        System.out.println ("age:" + age);
    }

    public int addAge (int i) {
        age += i;
        return age;
    }
}
