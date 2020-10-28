package blackberry.day8OOP1.PolymorphicClass;

/**
 * @Description: 多态性测试
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 00:05
 * Create By IntelliJ IDEA
 */
public class PolymorphicTest {
    /*
        面向对象的三大特征之：多态性
        1。理解多态：可以理解为一个事物的多种形态
        2。何为对象：
            对象的多态性：父类的引用(person1)指向子类的对象(new man())（或子类的对象赋值给父类的引用）
        3。多态的使用：虚拟方法调用
            有了对象的多态性以后，在编译的时候，只能调用父类中声明的方法，
            在运行的时候，我们实际上执行的是子类重写父类的方法
            总结：编译，看左边；运行，看右边
        4。多态性的使用前提：
            1。要有类的继承关系
            2。要有方法的重写
        5。对象的多态性，只适用于方法，不适用于属性（对于属性而言编译和运行的时候都是看左边，不是看右边）
        6。多态性是一个运行时行为，只有在运行时才能确定所调用的方法---动态绑定
     */
    public static void main (String[] args) {
        Person person = new Person ();
        person.eat ();
        Man man = new Man ();
        man.eat ();
        man.age = 25;
        man.makeMoney ();
        System.out.println ("***********************************");
        //  多态性：对象的多态性，只要是子类都可以
        //  父类的引用(person1)指向子类的对象(new man())
        Person person1 = new Man ();
        //  :也是多态性的体现
        Person person2 = new Woman ();
        person2.eat (); //  女生少吃减肥,调用的是子类woman重写的eat()方法

        //  多态的使用：当调用子父类同名同参数的方法时，实际上执行的是子类重写父类的方法---虚拟方法调用
//        person2.goshopping(); 现在就不能调用woman特有的goshopping 类


        //  Person有属性 id=1001 man有属性 id = 1002,此时Person person1 = new Man ();
        //  实际上person1的id属性是来自于父类，
        System.out.println (person1.id);


    }
}
