package blackberry.day7OOP3.Exe;

/**
 * @Description: test
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 17:47
 * Create By IntelliJ IDEA
 */
public class Person {
    /*
        1.创建程序，在其中定义两个类：Person和PersonTest类，
        定义如下：用setAge()设置人的合法年龄（0-130），用getAge()获取人的年龄。
        在PersonTest类中实例化Person类的对象B，调用setAge()和 getAge()方法，体会Java的封装性

        2。通过构造器把所有人的age属性初始值都设置为18
           修改题目中的类和构造器，增加name属性，使得每次创建Person对象的同时初始化对象的age属性和name属性
     */
    private int age;
    private String name;

    public void setAge (int a) {
        if (age < 0 || age > 130) {
            System.out.println ("输入的年龄是非法的！");
        } else {
            age = a;
        }
    }

    public int getAge () {
        return age;
    }

    public Person () {
        age = 18;
    }

    //  带参数的构造器
    public Person (String n, int a) {
        name = n;
        age = a;
    }

    //  体现类的封装性，通过get set方法获取name属性的值
    public void setName (String n) {
        name = n;
    }

    public String getName () {
        return name;
    }
}
