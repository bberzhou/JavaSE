package blackberry.day9OOP1.DesignPattern;

/**
 * @Description: 单例设计模式1
 * @author: bberzhou@gmail.com
 * @date: 4/23/20 15:25
 * Create By IntelliJ IDEA
 */
public class SingletonTest1 {
    /*
        单例模式：类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例


     */
    public static void main (String[] args) {
//        Bank bank = new Bank ();  因为构造器是private的，所以不能通过new的方式来创建对象
        Bank b1 = Bank.getInstance ();
        Bank b2 = Bank.getInstance ();

        //  因为这里Bank类只创建了内部的一个对象，此对象修饰为static的，所以b1 b2应该是相等的
        System.out.println (b1 == b2);   //  true


    }

}

//  饿汉式的单例模式
class Bank {
    //  1。私有化类的构造器，就是为了在类的外面去调用构造器（即在外部new对象）
    private Bank () {
        //
    }

    //  2。内部创建类的对象
    //  4。要求此对象也必须声明为静态的
    private static Bank instance = new Bank ();

    //  3。提供公共的静态方法，返回类的对象
    public static Bank getInstance () {
        //  静态方法调用的属性也是必须静态的
        return instance;
    }
}