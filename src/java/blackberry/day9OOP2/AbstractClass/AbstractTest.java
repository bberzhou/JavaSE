package blackberry.day9OOP2.AbstractClass;

/**
 * @Description: abstract类的使用
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 23:25
 * Create By IntelliJ IDEA
 */
public class AbstractTest {

    /*
              abstract关键字的使用
        1。abstract：抽象的
        2。abstract可以用来修饰的结构：类、方法
        3。abstract修饰类：抽象类
            >此类不能实例化
            >抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
            >开发中，都会提供抽象类的子类，让子类对象实例化。完成相关的操作

        4。abstract修饰方法：抽象方法
            >抽象方法只有方法的声明，没有方法体，
            >包含抽象方法的类，一定是一个抽象类，因为如果类不是抽象的，
             则可以通过new对象调方法。反之抽象类中可以没有抽象方法
            >若子类重写了父类中的所有的抽象方法后，此子类就可以实例化，
              若子类没有重写父类中的所有的抽象方法，则此子类中也是一个抽象方法，需要使用abstract修饰







     */

    public static void main (String[] args) {
        //  当Person使用abstract关键字修饰的时候，就不能实例化了
//        Person person = new Person ();
//        person.eat ();
    }
}

abstract class Creature {
    public abstract void Breath ();
}

//  让抽象的Person类继承抽象的Creature类，此时Person里面就有两个抽象方法了 walk()和Breath()
abstract class Person extends Creature {
    String name;
    int age;

    public Person () {

    }

    public Person (String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void eat () {
        System.out.println ("人吃饭");
    }

    //  父类定义抽象方法，没有方法体
    public abstract void walk ();
}

class Student extends Person {
    //  空参构造器
    public Student () {

    }

    public Student (String name, int age) {
        //  虽然父类是抽象的，但是仍然可以调用父类的构造器
        super (name, age);
    }

    //  子类继承父类时，实现父类的抽象方法，重写父类的方法
    @Override
    public void walk () {

    }

    //  此时Person的子类Student就要同时重写间接父类的抽象方法
    @Override
    public void Breath () {
        System.out.println ("重写间接父类的抽象方法breath");
    }

}