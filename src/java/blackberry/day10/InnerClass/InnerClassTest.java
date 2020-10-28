package blackberry.day10.InnerClass;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 12:28
 * Create By IntelliJ IDEA
 */
public class InnerClassTest {
    /*
        类的内部成员之五：内部类
        1.Java中运行将一个类A声明在类B中，则类A就是内部类，类B就称为外部类
        2。内部类的分类：成员内部类(静态的和非静态的) VS 局部内部类（方法内、代码块内、构造器内）

        3。成员内部类：
                一方面作为外部类的成员：
                    > 可以调用外部类的结构
                    > 可以被static修饰
                    > 可以被四种不同的权限修饰符修饰
                另一方面作为一个类：
                   > 类里面可以定义属性、方法、构造器等
                   > 可以被final修饰，表示此类不能被继承
                   > 可以被abstract修饰

         4。主要关注如下的3个问题
            4.1 如何实例化成员内部类的对象
            4.2 如何在成员内部类中区分调用外部类的结构
            4.3 开发中局部内部类的使用 ,可以看innerClassTest1
     */

    public static void main (String[] args) {
        //  创建内部类Dog实例（静态成员内部类）
        Person.Dog dog = new Person.Dog ();

        //  创建内部类Bird实例（非静态的成员内部类）
//        Person.Bird bird = new Person ().Bird; 这是错误的
        Person p = new Person ();
        Person.Bird bird = p.new Bird ();
        bird.sing ();

    }

}

class Person {
    //  外部类的方法
    public void eat () {
        System.out.println ("外部类的eat方法");
    }

    //  静态成员内部类
    static class Dog {

    }

    //  非静态成员内部类
    class Bird {
        String name;

        public void sing () {
            Person.this.eat (); //  调用外部类的方法，非静态的属性
        }


    }

    public void method () {
        //  局部内部类
        class AA {

        }
    }

    //  声明在代码块内
    {
        //  局部内部类
        class BB {

        }
    }

    public Person () {
        //  局部局部类
        class cc {

        }
    }

}
