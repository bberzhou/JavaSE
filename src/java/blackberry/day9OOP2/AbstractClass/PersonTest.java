package blackberry.day9OOP2.AbstractClass;

/**
 * @Description: 抽象类的匿名子类的使用
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 21:46
 * Create By IntelliJ IDEA
 */
public class PersonTest {
    /*
        抽象类的匿名子类的使用：


     */
    public static void main (String[] args) {
        method (new Student ());    // 匿名对象的使用 ，这里直接传入一个匿名对象

        //  在main方法里面调用method1方法,传入一个Person的子类对象worker
        Worker worker = new Worker ();
        method1 (worker);    // 非匿名的类，非匿名的对象
        method1 (new Worker ());    //  非匿名的类，匿名的对象


        System.out.println ("*************");
        //  创建了一个匿名子类的对象：P
        Person p = new Person () {
            //  因为这个是Person 的子类，所以需要重写Person类的抽象方法，
            //  但是这个子类并不是叫Person
            @Override
            public void walk () {
                System.out.println ("匿名子类的walk方法");
            }

            @Override
            public void Breath () {
                System.out.println ("匿名子类的Breath方法");
            }
        };
        //  匿名子类的对象传入方法，并且形参是Person类型的
        method1 (p);
        //  输出结果
        //  匿名子类的walk方法
        //  匿名子类的Breath方法

        System.out.println ("***************************");

        //  创建一个匿名子类的匿名对象，new Person ()提供了一个匿名子类的匿名对象
        method1 (new Person () {
            @Override
            public void walk () {
                System.out.println ("匿名子类的匿名对象中重写的walk方法");
            }

            @Override
            public void Breath () {
                System.out.println ("匿名子类的匿名对象中重写的Breath方法");
            }
        });
        //  输出结果
        //  匿名子类的匿名对象中重写的walk方法
        // 匿名子类的匿名对象中重写的Breath方法
    }

    //  把方法声明为静态的，就可以直接调用，不需要new对象调
    public static void method (Student s) {
    }

    public static void method1 (Person p) {
        p.walk ();
        p.Breath ();
    }
}

//  工人类继承字Person类
class Worker extends Person {

    //  继承Person抽象类时，需要重写父类的抽象方法
    @Override
    public void Breath () {

    }

    @Override
    public void walk () {

    }
}