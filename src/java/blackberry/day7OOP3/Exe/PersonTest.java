package blackberry.day7OOP3.Exe;

/**
 * @Description: personTest
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 17:48
 * Create By IntelliJ IDEA
 */
public class PersonTest {
    public static void main (String[] args) {
     /*
        1.创建程序，在其中定义两个类：Person和PersonTest类，
        定义如下：用setAge()设置人的合法年龄（0-130），用getAge()获取人的年龄。
        在PersonTest类中实例化Person类的对象B，调用setAge()和 getAge()方法，体会Java的封装性

        2。通过构造器把所有人的age属性初始值都设置为18

     */
        Person person = new Person ();
        person.setAge (70);
        System.out.println ("年龄为：" + person.getAge ());
        Person person1 = new Person ("tom", 21);
        System.out.println (person1.getAge () + person1.getName ());
    }
}
